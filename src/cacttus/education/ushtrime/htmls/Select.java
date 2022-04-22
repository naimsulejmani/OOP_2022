package cacttus.education.ushtrime.htmls;

import java.util.ArrayList;
import java.util.List;

public class Select extends HtmlElement {
    private List<Option> options = new ArrayList<>();

    public Select() {
    }

    public Select(String id) {
        super(id);
    }

    public Select(String id, String name) {
        super(id, name);
    }

    public void addOption(Option option) {
        this.options.add(option);
    }

    @Override
    public String toString() {
        String selectHtml =
                "<select id='" + getId() + "' name='" + getName() + "'>\n";
        for (Option option : options) {
            selectHtml += option + "\n";
        }
        selectHtml += "</select>";
        return selectHtml;
    }
}








