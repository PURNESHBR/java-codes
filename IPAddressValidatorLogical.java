public class IPAddressValidatorLogical {
    public static void main(String[] args) {
        String ip = "192.168.1.1";

        if (isValidIP(ip)) {
            System.out.println(ip + " is a valid IP address.");
        } else {
            System.out.println(ip + " is not a valid IP address.");
        }
    }

    public static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");

        // IP address must have exactly 4 parts
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);

                // Each part must be in range 0 to 255
                if (num < 0 || num > 255) {
                    return false;
                }

                // No leading zeros allowed (except for '0')
                if (part.length() > 1 && part.startsWith("0")) {
                    return false;
                }
            } catch (NumberFormatException e) {
                // If part is not a valid integer
                return false;
            }
        }

        return true;
    }
}