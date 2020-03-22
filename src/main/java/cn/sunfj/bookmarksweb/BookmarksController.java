package cn.sunfj.bookmarksweb;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author sunfujian
 * @date 2020/3/17
 **/

@RestController
public class BookmarksController {

    @Autowired
    BookmarkDao bookmarkDao;
    
    @PostMapping("/add")
    public String add(@RequestBody Bookmark bookmark) {
        bookmark.setDateAdded(System.currentTimeMillis());
        bookmark.setDateUpdated(System.currentTimeMillis());
        System.out.println(JSON.toJSONString(bookmark, true));
        bookmarkDao.save(bookmark);
        return "OK";
    }

    @PostMapping("/push/list")
    public String pushAll(@RequestBody Bookmark bookmark) {
        System.out.println(JSON.toJSONString(bookmark, true));
        bookmarkDao.save(bookmark);
        return "OK";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        bookmarkDao.deleteById(id);
        System.out.println("delete id:"+id);
        return "OK";
    }
    
    @PostMapping("/change/{id}")
    public String change(@RequestBody Bookmark bookmark, @PathVariable String id) {
        System.out.println("id:"+id +"----"+JSON.toJSONString(bookmark, true));
//        Optional<Bookmark> bk = repository.findById(id);
//        bookmarkDao.saveAndFlush(bookmark);
//        bookmarkDao.changeBookmarkById(id, bookmark);
        
        return "OK";
    }
    
    @PostMapping("/move")
    public String move(@RequestBody Map moveInfo) {
        System.out.println(JSON.toJSONString(moveInfo, true));
        return "OK";
    }

    @GetMapping("/find/list")
    public String getAll() {
        List<Bookmark> allBk = bookmarkDao.findAll(Sort.by("id"));
        return allBk.toString();
    }

    @GetMapping("/version")
    public int getVersion() {
        return bookmarkDao.findById("version").get().index;
    }

    public Bookmark updateVersion() {
        Bookmark bk = bookmarkDao.findById("version").get();
        bk.index += 1;
        return bookmarkDao.save(bk);
    }
}
