package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> children = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<CategoryItem> categoryItems = new ArrayList<>();

    public void setId(Long id) {
        this.id = id;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public Category getParent() {
        return parent;
    }

    public List<Category> getChildren() {
        return children;
    }

    public List<CategoryItem> getCategoryItems() {
        return categoryItems;
    }
}
