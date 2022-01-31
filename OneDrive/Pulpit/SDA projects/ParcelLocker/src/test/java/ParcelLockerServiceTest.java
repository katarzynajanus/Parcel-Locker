import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParcelLockerServiceTest {

    //napisz testy dla metody addParcelLocker

    @Test
    void given_valid_input_when_adding_via_service_then_parcel_should_be_added_to_collection() {
        //given
        ParcelLockerService parcelLockerService = new ParcelLockerService();
        int id = 10;
        String name = "SZC34L";
        String address = "Akacjowa,Szczecin,70-000";
        int capacity = 20;

        //when
        boolean result = parcelLockerService.addParcelLocker(id, name, address, capacity);

        //then
        Assertions.assertTrue(result);
        ParcelLocker parcelLocker = getById(parcelLockerService, id);
        Assertions.assertNotNull(parcelLocker);
        Assertions.assertEquals(name, parcelLocker.getName());
        Assertions.assertEquals(address, parcelLocker.getAddress());
        Assertions.assertEquals(capacity, parcelLocker.getCapacity());
    }

    @Test
    void given_existing_parcel_locker_id_when_removing_parcel_locker_then_parcel_should_be_removed_from_collection() {
        //given
        ParcelLockerService parcelLockerService = new ParcelLockerService();
        ParcelLockerCollection parcelLockerCollection = new ParcelLockerCollection();
        parcelLockerCollection.addParcelLocker(new ParcelLocker(1, "Test", "Akacjowa,Szczecin,70-000", 20));
        parcelLockerService.setParcelLockerCollection(parcelLockerCollection);

        //when
        parcelLockerService.removeParcelLocker(1);q

        //then

        ParcelLocker parcelLocker = getById(parcelLockerService,1);

        Assertions.assertNull(parcelLocker);



    }


    //metoda pomocnicza, która szuka obiektu o wskazanym id w kolekcji
    private ParcelLocker getById(ParcelLockerService parcelLockerService, int id) {
        for (ParcelLocker parcelLocker : parcelLockerService.getParcelLockers()) {
            if (parcelLocker != null && parcelLocker.getId() == id) {
                return parcelLocker;
            }
        }
        return null;
    }


}
