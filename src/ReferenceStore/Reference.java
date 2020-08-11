package ReferenceStore;

/**
 * Reference.
 *
 * @author Roman Khokhlov
 */
public class Reference {
    private String url;
    private String name;
    private String tag;

    public Reference(String url, String name, String tag) {
        this.url = url;
        this.name = name;
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Reference{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
