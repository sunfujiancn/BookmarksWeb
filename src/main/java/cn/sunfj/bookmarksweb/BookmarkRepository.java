package cn.sunfj.bookmarksweb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BookmarkRepository extends JpaRepository<Bookmark, String> {
    
    @Modifying
    @Query()
    int updateBookmarkById(String id, Bookmark bk);
    
}
