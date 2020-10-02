package kitchenpos;

import kitchenpos.domain.Menu;
import kitchenpos.domain.MenuGroup;
import kitchenpos.domain.MenuProduct;
import kitchenpos.domain.Product;

import java.math.BigDecimal;
import java.util.List;

public class DomainFactory {
    public static MenuGroup createMenuGroup(String name) {
        MenuGroup menuGroup = new MenuGroup();
        menuGroup.setName(name);
        return menuGroup;
    }

    public static Product createProduct(String name, BigDecimal price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        return product;
    }

    public static MenuProduct createMenuProduct(Long productId, long quantity) {
        return createMenuProduct(null, productId, quantity);
    }

    public static MenuProduct createMenuProduct(Long menuId, Long productId, long quantity) {
        MenuProduct menuProduct = new MenuProduct();
        menuProduct.setMenuId(menuId);
        menuProduct.setProductId(productId);
        menuProduct.setQuantity(quantity);
        return menuProduct;
    }

    public static Menu createMenuWithMenuProducts(Long menuGroupId, String name,
                                                  BigDecimal price, List<MenuProduct> menuProducts) {
        Menu menu = new Menu();
        menu.setMenuGroupId(menuGroupId);
        menu.setPrice(price);
        menu.setName(name);
        menu.setMenuProducts(menuProducts);
        return menu;
    }

    public static Menu createMenu(Long menuGroupId, String name, BigDecimal price) {
        Menu menu = new Menu();
        menu.setMenuGroupId(menuGroupId);
        menu.setName(name);
        menu.setPrice(price);
        return menu;
    }
}
