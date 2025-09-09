public class InvalidNIMException extends Exception{
    public InvalidNIMException (String message) {
        super(message);
    }

    void validateNIM(String nim) throws InvalidNIMException {
        if (nim != "102022400056") {
            throw new InvalidNIMException("NIM harus sama dengan NIM penulis kode");
        }
    }
}