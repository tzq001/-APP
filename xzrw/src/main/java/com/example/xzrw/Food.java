package com.example.xzrw;

public class Food {
    private int imageID;
    private int image;
    private String name;
    private String price;
    private String time;
    private String shopname;
    private String status;

    public int getImageID() {
        return imageID;
    }
    public int getImage(){
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getTime() {
        return time;
    }

    public String getShopname(){
        return shopname;
    }
    public String getStatus(){
        return status;
    }

    public Food(int imageID,int image, String name, String price, String time,String shopname,String status) {
        this.imageID = imageID;
        this.image=image;
        this.name = name;
        this.price = price;
        this.time = time;
        this.shopname=shopname;
        this.status=status;
    }
}
