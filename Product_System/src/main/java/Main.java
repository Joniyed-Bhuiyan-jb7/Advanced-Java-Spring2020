import model.Product;import service.ProductService;public class Main {    public static void main(String[] args) {        ProductService productService = new ProductService();        //System.out.println(productService.getAllProducts().size());        //productService.getAllProducts().forEach(System.out::println);        //productService.getAllProducts().forEach(System.out::println);        //System.out.println("SearchResult..");        //System.out.println(productService.getSingleProduct(2));        productService.createProduct(new Product(105,"Black Forest cake","1 pound",220,100,300,40,true));        //productService.updateProduct(new Product(152,"Joniyed bhuiyan","10 case",20,100,200,400,false),152);        //productService.deleteProduct(3);        //productService.updateProduct(new Product(3,"Mum Water bottle","10 case",20,100,200,400,false),3);        //productService.deleteProduct(3);        productService.closeAll();    }}