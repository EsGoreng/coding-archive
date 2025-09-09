public class NegativeNumberException extends Exception{
    public NegativeNumberException (String message) {
        super(message);
    }
    
    void validateNumber(int angka) throws NegativeNumberException {
        if (angka < 0) {
            throw new NegativeNumberException("Angka tidak boleh kurang dari 0");
        }
    }
}
