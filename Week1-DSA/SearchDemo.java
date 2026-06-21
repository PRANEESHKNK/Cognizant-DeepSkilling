class Product {
    int productId;
    String productName;
    String category;
    Product(int productId,String productName,String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public static Product linearSearch(Product[] products,String name){
        for(int i=0;i<products.length;i++){
            if(products[i].productName.equalsIgnoreCase(name)){
                return products[i];
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products,String name){
        int left=0;
        int right=products.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            int result = products[mid].productName.compareToIgnoreCase(name);
            if (result==0){
                return products[mid];
            }
            else if(result<0){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return null;
    }
}
public class SearchDemo{
    public static void main(String args[]){
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };
        Product result1=Product.linearSearch(products,"Mobile");
        if (result1 != null) {
            System.out.println("Linear Search Found:");
            System.out.println(result1.productId + " "
                    + result1.productName + " "
                    + result1.category);
        } else {
            System.out.println("Product not found");
        }

        Product result2 = Product.binarySearch(products, "Shoes");
        if (result2 != null) {
            System.out.println("Binary Search Found:");
            System.out.println(result2.productId + " "+ result2.productName + " "+ result2.category);
        } else {
            System.out.println("Product not found");
        }
    }
}
