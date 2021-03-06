package org.mozilla.webmaker.activity;

import android.os.Bundle;

import org.mozilla.webmaker.R;
import org.mozilla.webmaker.WebmakerActivity;
import org.mozilla.webmaker.router.SimpleRouter;

public class TagList extends WebmakerActivity {

    public TagList() {
        super("tag-list", R.id.tag_list_layout, R.layout.tag_list_layout, R.menu.menu_tag_list);
        // SimpleRouter.getSharedRouter().call("/users/" + userId + "/projects/" + id + "/play");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.getActionBar() != null) {
            this.getActionBar().setDisplayShowTitleEnabled(false);
        }
    }
}
