package in.co.b2bhub.www.cardviewdemo;

/**
 * Created by B2B Android on 1/24/2017.
 */

public class Contact
{
    public Contact(int img_id,String name,String email,String mobile)
    {
        this.setImg_id(img_id);
        this.setName(name);
        this.setEmail(email);
        this.setMobile(mobile);


    }
    private int img_id;
    private String name,email,mobile;

    public int getImg_id()
    {
        return img_id;
    }

    public void setImg_id(int img_id)
    {
        this.img_id = img_id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
}
