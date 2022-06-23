public class checkUrl {

    public static void main(String[] args) {

        String url = "https://google.com";
        String[] splitString = url.split("://google");
        String protocolSecure = splitString[0];
        String domainUrl = splitString[1];
        if (protocolSecure.equals("https")) {
            System.out.println("Protocol of this Url is : " + protocolSecure);
        } else
            System.out.println("This url contain " + protocolSecure);
        if (domainUrl.equals(".com")) {
            System.out.println("Domain of this Url is : " + domainUrl);
        } else System.out.println("This URL contain " + domainUrl);
    }
}

