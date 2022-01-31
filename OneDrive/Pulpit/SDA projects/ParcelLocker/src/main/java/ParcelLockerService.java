public class ParcelLockerService {
    private ParcelLockerCollection parcelLockerCollection = new ParcelLockerCollection();

    public boolean addParcelLocker(int id, String name, String address, int capacity) {
        boolean isValid = ParcelLockerValidation.validate(id, name, address, capacity);
        if (isValid) {
            ParcelLocker parcelLocker = new ParcelLocker(id, name, address, capacity);
            parcelLockerCollection.addParcelLocker(parcelLocker);
        }
        return isValid;
    }


    public ParcelLocker[] getParcelLockers() {
        return parcelLockerCollection.getParcelLockers();
    }

    public void removeParcelLocker(int id) {
        parcelLockerCollection.deleteParcelLocker(id);
    }


    void setParcelLockerCollection(ParcelLockerCollection parcelLockerCollection) {
        this.parcelLockerCollection = parcelLockerCollection;
    }
}
