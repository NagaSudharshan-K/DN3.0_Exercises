public class ObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        MobileApp mobileApp = new MobileApp();
        WebApp webApp = new WebApp();
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);
        stockMarket.setStockPrice(500);
        stockMarket.removeObserver(mobileApp);
        stockMarket.setStockPrice(1000);
    }
}
