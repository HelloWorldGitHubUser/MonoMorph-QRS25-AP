# jpetstore-6
## account
### Expected inter-service class interactions
- org.mybatis.jpetstore.web.actions.AccountActionBean -> org.mybatis.jpetstore.service.CatalogService
### Potential Test inter-service class interactions
- org.mybatis.jpetstore.domain.CartTest -> org.mybatis.jpetstore.domain.Cart
- org.mybatis.jpetstore.domain.CartTest -> org.mybatis.jpetstore.domain.CartItem
- org.mybatis.jpetstore.domain.CartTest -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.Cart
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.LineItem
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.Order
- org.mybatis.jpetstore.mapper.CategoryMapperTest -> org.mybatis.jpetstore.domain.Category
- org.mybatis.jpetstore.mapper.CategoryMapperTest -> org.mybatis.jpetstore.mapper.CategoryMapper
- org.mybatis.jpetstore.mapper.ItemMapperTest -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.mapper.ItemMapperTest -> org.mybatis.jpetstore.domain.Product
- org.mybatis.jpetstore.mapper.ItemMapperTest -> org.mybatis.jpetstore.mapper.ItemMapper
- org.mybatis.jpetstore.mapper.LineItemMapperTest -> org.mybatis.jpetstore.domain.LineItem
- org.mybatis.jpetstore.mapper.LineItemMapperTest -> org.mybatis.jpetstore.mapper.LineItemMapper
- org.mybatis.jpetstore.mapper.OrderMapperTest -> org.mybatis.jpetstore.domain.Order
- org.mybatis.jpetstore.mapper.OrderMapperTest -> org.mybatis.jpetstore.mapper.OrderMapper
- org.mybatis.jpetstore.mapper.ProductMapperTest -> org.mybatis.jpetstore.domain.Product
- org.mybatis.jpetstore.mapper.ProductMapperTest -> org.mybatis.jpetstore.mapper.ProductMapper
- org.mybatis.jpetstore.mapper.SequenceMapperTest -> org.mybatis.jpetstore.domain.Sequence
- org.mybatis.jpetstore.mapper.SequenceMapperTest -> org.mybatis.jpetstore.mapper.SequenceMapper
- org.mybatis.jpetstore.service.CatalogServiceTest -> org.mybatis.jpetstore.mapper.CategoryMapper
- org.mybatis.jpetstore.service.CatalogServiceTest -> org.mybatis.jpetstore.mapper.ItemMapper
- org.mybatis.jpetstore.service.CatalogServiceTest -> org.mybatis.jpetstore.mapper.ProductMapper
- org.mybatis.jpetstore.service.CatalogServiceTest -> org.mybatis.jpetstore.service.CatalogService
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.domain.LineItem
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.domain.Order
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.mapper.ItemMapper
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.mapper.LineItemMapper
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.mapper.OrderMapper
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.mapper.SequenceMapper
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.service.OrderService
- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest -> org.mybatis.jpetstore.web.actions.CatalogActionBean
- org.mybatis.jpetstore.web.actions.OrderActionBeanTest -> org.mybatis.jpetstore.web.actions.OrderActionBean

## order
### Expected inter-service class interactions
- org.mybatis.jpetstore.domain.Cart -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.domain.LineItem -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.domain.Order -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.web.actions.OrderActionBean -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.web.actions.OrderActionBean -> org.mybatis.jpetstore.web.actions.AccountActionBean
- org.mybatis.jpetstore.web.actions.OrderActionBean -> org.mybatis.jpetstore.web.actions.CartActionBean
- org.mybatis.jpetstore.service.OrderService -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.service.OrderService -> org.mybatis.jpetstore.mapper.ItemMapper
### Potential Test inter-service class interactions
- org.mybatis.jpetstore.domain.CartTest -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.mapper.AccountMapperTest -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.mapper.AccountMapperTest -> org.mybatis.jpetstore.mapper.AccountMapper
- org.mybatis.jpetstore.mapper.CategoryMapperTest -> org.mybatis.jpetstore.domain.Category
- org.mybatis.jpetstore.mapper.CategoryMapperTest -> org.mybatis.jpetstore.mapper.CategoryMapper
- org.mybatis.jpetstore.mapper.ItemMapperTest -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.mapper.ItemMapperTest -> org.mybatis.jpetstore.domain.Product
- org.mybatis.jpetstore.mapper.ItemMapperTest -> org.mybatis.jpetstore.mapper.ItemMapper
- org.mybatis.jpetstore.mapper.ProductMapperTest -> org.mybatis.jpetstore.domain.Product
- org.mybatis.jpetstore.mapper.ProductMapperTest -> org.mybatis.jpetstore.mapper.ProductMapper
- org.mybatis.jpetstore.service.AccountServiceTest -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.service.AccountServiceTest -> org.mybatis.jpetstore.mapper.AccountMapper
- org.mybatis.jpetstore.service.AccountServiceTest -> org.mybatis.jpetstore.service.AccountService
- org.mybatis.jpetstore.service.CatalogServiceTest -> org.mybatis.jpetstore.mapper.CategoryMapper
- org.mybatis.jpetstore.service.CatalogServiceTest -> org.mybatis.jpetstore.mapper.ItemMapper
- org.mybatis.jpetstore.service.CatalogServiceTest -> org.mybatis.jpetstore.mapper.ProductMapper
- org.mybatis.jpetstore.service.CatalogServiceTest -> org.mybatis.jpetstore.service.CatalogService
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.domain.Item
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.mapper.ItemMapper
- org.mybatis.jpetstore.web.actions.AccountActionBeanTest -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.web.actions.AccountActionBeanTest -> org.mybatis.jpetstore.web.actions.AccountActionBean
- org.mybatis.jpetstore.web.actions.CatalogActionBeanTest -> org.mybatis.jpetstore.web.actions.CatalogActionBean

## catalog
### Expected inter-service class interactions
- org.mybatis.jpetstore.web.actions.CartActionBean -> org.mybatis.jpetstore.domain.Cart
- org.mybatis.jpetstore.web.actions.CartActionBean -> org.mybatis.jpetstore.domain.CartItem
### Potential Test inter-service class interactions
- org.mybatis.jpetstore.domain.CartTest -> org.mybatis.jpetstore.domain.Cart
- org.mybatis.jpetstore.domain.CartTest -> org.mybatis.jpetstore.domain.CartItem
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.Cart
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.LineItem
- org.mybatis.jpetstore.domain.OrderTest -> org.mybatis.jpetstore.domain.Order
- org.mybatis.jpetstore.mapper.AccountMapperTest -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.mapper.AccountMapperTest -> org.mybatis.jpetstore.mapper.AccountMapper
- org.mybatis.jpetstore.mapper.LineItemMapperTest -> org.mybatis.jpetstore.domain.LineItem
- org.mybatis.jpetstore.mapper.LineItemMapperTest -> org.mybatis.jpetstore.mapper.LineItemMapper
- org.mybatis.jpetstore.mapper.OrderMapperTest -> org.mybatis.jpetstore.domain.Order
- org.mybatis.jpetstore.mapper.OrderMapperTest -> org.mybatis.jpetstore.mapper.OrderMapper
- org.mybatis.jpetstore.mapper.SequenceMapperTest -> org.mybatis.jpetstore.domain.Sequence
- org.mybatis.jpetstore.mapper.SequenceMapperTest -> org.mybatis.jpetstore.mapper.SequenceMapper
- org.mybatis.jpetstore.service.AccountServiceTest -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.service.AccountServiceTest -> org.mybatis.jpetstore.mapper.AccountMapper
- org.mybatis.jpetstore.service.AccountServiceTest -> org.mybatis.jpetstore.service.AccountService
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.domain.LineItem
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.domain.Order
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.mapper.LineItemMapper
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.mapper.OrderMapper
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.mapper.SequenceMapper
- org.mybatis.jpetstore.service.OrderServiceTest -> org.mybatis.jpetstore.service.OrderService
- org.mybatis.jpetstore.web.actions.AccountActionBeanTest -> org.mybatis.jpetstore.domain.Account
- org.mybatis.jpetstore.web.actions.AccountActionBeanTest -> org.mybatis.jpetstore.web.actions.AccountActionBean
- org.mybatis.jpetstore.web.actions.OrderActionBeanTest -> org.mybatis.jpetstore.web.actions.OrderActionBean
