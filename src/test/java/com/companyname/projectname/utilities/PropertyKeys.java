package com.companyname.projectname.utilities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PropertyKeys {
    HOST("host");
    private final String key;
}
