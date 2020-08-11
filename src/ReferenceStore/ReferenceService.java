package ReferenceStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ReferenceService.
 *
 * @author Roman Khokhlov
 */
public class ReferenceService {
    // Map для хранения ссылок (ключ - тэг, значение - массив ссылок)
    private Map<String, ArrayList<Reference>> referenceRepository = new HashMap<>();

    public void addReferenceToMap(Reference ref) {
        String tag = ref.getTag();
        if (referenceRepository.containsKey(tag)) {
            referenceRepository.get(tag).add(ref);
        } else {
            ArrayList<Reference> references = new ArrayList<>();
            references.add(ref);
            referenceRepository.put(tag, references);
        }
    }

    public void ReferenceMapToString() {
        System.out.println(referenceRepository.toString());
    }

    public void showAllReferencesByTag(String tag) {
        if (referenceRepository.containsKey(tag)) {
            System.out.println(referenceRepository.get(tag).toString());
        } else {
            System.out.println("Ссылок с тэгом " + tag + " не существует");
        }
    }

}
