import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParcelLockerValidationTest {

       /*
    test w którym id jest niepoprawne
    test w którym name jest niepoprawny
    test w którym address jest niepoprawny
    test w którym capacity jest niepoprawne
    test w którym wszystko jest niepoprawne
    test w którym address jest pusty
    test w którym name lub address jest równy null
     */


    @Test
    void given_Id__10_Name__WAW_Address__Zlota__Warszawa__02_495_capacity__20_when_validate_then_validation_should_return_true() {
        //given
        int id = 10;
        String name = "WAW";
        String adress = "Warszawa,Zlota,02-495";
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidation.validate(id, name, adress, capacity);

        //then
        Assertions.assertTrue(isValid);

    }

    @Test
    void given_Id__500_Name__WAW_Address__Zlota__Warszawa__02_495_capacity__20_when_validate_then_validation_should_return_true() {
        //given
        int id = 500;
        String name = "WAW";
        String adress = "Warszawa,Zlota,02-495";
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidation.validate(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);

    }

    @Test
    void given_Id__10_Name__W_Address__Zlota__Warszawa__02_495_capacity__20_when_validate_then_validation_should_return_true() {
        //given
        int id = 10;
        String name = "W";
        String adress = "Warszawa,Zlota,02-495";
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidation.validate(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);


    }

    @Test
    void given_Id__10_Name__WAW_Address__Zlota__02_495_capacity__20_when_validate_then_validation_should_return_true() {
        //given
        int id = 10;
        String name = "WAW";
        String adress = "Zlota,02-495";
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidation.validate(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);


    }

    @Test
    void given_Id__10_Name__WAW_Address__Zlota__Warszawa__02_495_capacity__500_when_validate_then_validation_should_return_true() {
        //given
        int id = 10;
        String name = "WAW";
        String adress = "Warszawa,Zlota,02-495";
        int capacity = 500;

        //when
        boolean isValid = ParcelLockerValidation.validate(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);


    }

    @Test
    void given_Id__1000_Name__W_Address__Zlota__02_495_capacity__500_when_validate_then_validation_should_return_true() {
        //given
        int id = 1000;
        String name = "W";
        String adress = "Zlota,02-495";
        int capacity = 500;

        //when
        boolean isValid = ParcelLockerValidation.validate(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);


    }

    @Test
    void given_Id__10_Name__WAW_Address_capacity__20_when_validate_then_validation_should_return_true() {
        //given
        int id = 10;
        String name = "WAW";
        String adress = "";
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidation.validate(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);
    }

    @Test
    void given_Id__10_Name__null_Address_null__capacity__20_when_validate_then_validation_should_return_true() {
        //given
        int id = 10;
        String name = null;
        String adress = null;
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidation.validate(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);
    }


    @Test
    void given_Id__10_Name_____Address_null__capacity__20_when_validate_then_validation_should_return_true() {
        //given
        int id = 10;
        String name = "       ";
        String adress = null;
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidation.validate(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);
    }

}