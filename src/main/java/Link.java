public class Link {

    private String tittle;
    private String descrption;
    private String url;

    public Link(String url) {
        this.url = url;
    }


    public Link(String tittle, String url) {
        this.tittle = tittle;
        this.url = url;
    }

    public String getTittle() {
        return tittle;
    }


    public String getDescrption() {
        return descrption;
    }

    public String getUrl() {
        return url;
    }

}
