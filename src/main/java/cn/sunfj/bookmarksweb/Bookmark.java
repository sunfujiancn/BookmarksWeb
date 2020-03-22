package cn.sunfj.bookmarksweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 书签实体类
 * @author sunfujian
 * @date 2020/3/18
 **/

@Entity
public class Bookmark {
    @Id
    String id;
    @Column(name = "bk_index")
    int index;
    @Column(name = "title")
    String title;
    @Column(name = "date_added")
    long dateAdded;
    @Column(name = "date_updated")
    long dateUpdated;
    @Column(name = "parent_id")
    String parentId;
    @Column(name = "url")
    String url;
    @Column(name = "icon")
    String icon;
    @Column(name = "icon_url")
    String iconUrl;
    @Column(name = "is_dir")
    boolean isDir;
    @Column(name = "extra_1")
    String extra_1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(long dateAdded) {
        this.dateAdded = dateAdded;
    }

    public long getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(long dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public boolean isDir() {
        return isDir;
    }

    public void setDir(boolean dir) {
        isDir = dir;
    }

    public String getExtra_1() {
        return extra_1;
    }

    public void setExtra_1(String extra_1) {
        this.extra_1 = extra_1;
    }
}
