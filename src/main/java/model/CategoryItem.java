package model;

import jakarta.persistence.*;

@Entity
public class CategoryItem {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryItem")
    @Column(name = "ITEM_FK")
    private Item item;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryItem")
    @Column(name = "CATEGORY_FK")
    private Category category;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
        item.getCategoryItem().add(this);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
        category.getCategoryItems().add(this);
    }
}
