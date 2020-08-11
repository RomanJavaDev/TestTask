package ReferenceStore;

/**
 * Main.
 *
 * @author Roman Khokhlov
 */
public class Main {
    public static void main(String[] args) {
        ReferenceService referenceService = new ReferenceService();
        Reference ref1 = new Reference("www.google.com", "google", "#search");
        Reference ref2 = new Reference("www.youtube.com", "youtube", "#video");
        Reference ref3 = new Reference("www.yandex.ru", "yandex", "#search");
        Reference ref4 = new Reference("www.facebook.com", "facebook", "#social");
        Reference ref5 = new Reference("www.vk.com", "vk", "#social");

        referenceService.addReferenceToMap(ref1);
        referenceService.addReferenceToMap(ref2);
        referenceService.addReferenceToMap(ref3);
        referenceService.addReferenceToMap(ref4);
        referenceService.addReferenceToMap(ref5);

        referenceService.ReferenceMapToString();

        referenceService.showAllReferencesByTag("#social");
        referenceService.showAllReferencesByTag("#abc");

    }
}
