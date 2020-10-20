package kitchenpos.application;

import kitchenpos.domain.Price;
import kitchenpos.domain.Product;
import kitchenpos.dto.ProductRequest;
import kitchenpos.dto.ProductResponse;
import kitchenpos.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Product create(final Product product) {
//        final BigDecimal price = product.getPrice();
//
//        if (Objects.isNull(price) || price.compareTo(BigDecimal.ZERO) < 0) {
//            throw new IllegalArgumentException();
//        }
        final Price price = product.getPrice();
//        if (price.isInvalidPrice()) {
//            throw new IllegalArgumentException();
//        }

        return productRepository.save(product);
    }

    public ProductResponse createWithRequest(ProductRequest productRequest) {
        return null;
    }

    public List<Product> list() {
        return productRepository.findAll();
    }

    public List<ProductResponse> listWithResponse() {
        return null;
    }
}
