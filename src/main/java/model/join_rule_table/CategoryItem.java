package model.join_rule_table;

import jakarta.persistence.*;
import model.Category;
import model.items.Item;

@Entity
public class CategoryItem {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
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
