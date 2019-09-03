package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy" );
    Date date_Of_Birth = parseDate("03/08/2019");

    Date parseDate(final  String dateString){
        try {
            return  simpleDateFormat.parse(dateString);
        } catch (final ParseException e){

            return new Date();
        }
    }

    @Test
    public void buildUserDemography() {

        UserDemography userDemography = UserDemographyFactory.buildUserDemography("Sphe@gmail.com","Mr","001","020",date_Of_Birth);
        Assert.assertEquals("Sphe@gmail.com",userDemography.getUserEmail());
        Assert.assertNotNull(userDemography);
    }
}
