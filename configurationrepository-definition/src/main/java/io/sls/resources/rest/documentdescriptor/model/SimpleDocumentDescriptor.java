package io.sls.resources.rest.documentdescriptor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ginccc
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SimpleDocumentDescriptor {
    private String name;
    private String description;

}
