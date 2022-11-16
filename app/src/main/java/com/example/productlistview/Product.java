package com.example.productlistview;

public class Product {
    public String p_intitule;
    public float p_prix;
    public int url;

    public Product(String p_intitule, float p_prix, int url) {
        this.p_intitule = p_intitule;
        this.p_prix = p_prix;
        this.url=url;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }

    public String getP_intitule() {
        return p_intitule;
    }

    public void setP_intitule(String p_intitule) {
        this.p_intitule = p_intitule;
    }

    public float getP_prix() {
        return p_prix;
    }

    public void setP_prix(float p_prix) {
        this.p_prix = p_prix;
    }

    @Override
    public String toString() {
        return "Product{" +
                "p_intitule='" + p_intitule + '\'' +
                ", p_prix=" + p_prix +
                '}';
    }
}
