package model.sites;

import lombok.Getter;

public enum Site {

    TOPKY("www.topky.sk"),
    SME("www.sme.sk"),
    DENNIKN("www.dennikn.sk");

    @Getter
    final String url;

    Site(String url) {
        this.url = url;
    }
}
