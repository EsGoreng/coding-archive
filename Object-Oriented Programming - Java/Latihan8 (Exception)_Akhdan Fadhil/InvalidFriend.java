public class InvalidFriend extends Exception {
    public InvalidFriend(String message) {
        super(message);
    }

    void validateFriend(String friendname) throws InvalidFriend {
        if (friendname == null || friendname.isEmpty()) {
            throw new InvalidFriend("Friend name cannot be null or empty.");
        } 
    }
}
