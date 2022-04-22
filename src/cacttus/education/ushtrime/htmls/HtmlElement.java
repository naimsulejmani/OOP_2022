package cacttus.education.ushtrime.htmls;

public class HtmlElement {
    private String id;
    private String name;
    private String clazz;
    private String style;

    public HtmlElement() {
    }

    public HtmlElement(String id) {
        this.id = id;
    }

    public HtmlElement(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
