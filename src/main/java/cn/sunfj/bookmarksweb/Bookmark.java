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
    public String id;
    @Column(name = "bk_index")
    public int index;
    @Column(name = "title")
    public String title;
    @Column(name = "date_added")
    public long dateAdded;
    @Column(name = "parent_id")
    public String parentId;
    @Column(name = "url")
    public String url;
    @Column(name = "icon")
    public String icon;
    @Column(name = "icon_url")
    public String iconUrl;
    
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
}
