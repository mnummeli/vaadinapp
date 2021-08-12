package fi.tslespoo.vaadinapp.ui;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("/ruokalista")
public class RuokalistaView extends VerticalLayout {

    public RuokalistaView() {
        super();
        H1 caption = new H1("Ruokalista");
        HorizontalLayout ruokalistaItem = new HorizontalLayout();
        VerticalLayout kuvausItem = new VerticalLayout();
        kuvausItem.add(new H2("Kaurapuuro"));
        kuvausItem.add(new Paragraph("Perinteinen keskitysleiriruoka."));
        ruokalistaItem.add(kuvausItem);
        ruokalistaItem.add(new H3("3,40€"));
        add(caption, new Hr(), ruokalistaItem);
    }
}
