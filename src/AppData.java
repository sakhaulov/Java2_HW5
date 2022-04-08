public class AppData {

    private String[] headers;
    private int[][] data;

    public AppData(String[] headers, int[][] data) {
        this.headers = headers;
        this.data = data;
    }

    public String[] getHeaders() {
        return headers;
    }

    public int[][] getData() {
        return data;
    }

}



