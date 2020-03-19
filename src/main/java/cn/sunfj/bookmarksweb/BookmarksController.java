package cn.sunfj.bookmarksweb;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

/**
 * @author sunfujian
 * @date 2020/3/17
 **/

@RestController
public class BookmarksController {
    
    @Autowired
    private BookmarkRepository repository;
    
    @PostMapping("/add")
    public String addMarks(@RequestBody Bookmark bookmark) {
        System.out.println(JSON.toJSONString(bookmark, true));
        repository.save(bookmark);
        return "OK";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteMarks(@PathVariable String id) {
        repository.deleteById(id);
        System.out.println("id:"+id);
        return "OK";
    }
    
    @PostMapping("/change/{id}")
    public String changeMarks(@RequestBody Bookmark bookmark, @PathVariable String id) {
        System.out.println("id:"+id +"----"+JSON.toJSONString(bookmark, true));
        Optional<Bookmark> bk = repository.findById(id);
        repository.saveAndFlush(bookmark);
        
        return "OK";
    }
    
    @PostMapping("/move")
    public String moveMarks(@RequestBody Map moveInfo) {
        System.out.println(JSON.toJSONString(moveInfo, true));
        return "OK";
    }
}
