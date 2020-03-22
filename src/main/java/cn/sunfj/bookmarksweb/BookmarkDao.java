package cn.sunfj.bookmarksweb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkDao extends JpaRepository<Bookmark, String> {

}
