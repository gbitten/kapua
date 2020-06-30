/*******************************************************************************
 * Copyright (c) 2017 Red Hat Inc and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat Inc - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.kura.simulator.generator.basic;

import java.util.Map;
import java.util.Optional;

import org.eclipse.kapua.kura.simulator.generator.Generator;
import org.eclipse.kapua.kura.simulator.generator.Generators;

public class BinaryGeneratorFactory extends AbstractGeneratorFactory {

    public BinaryGeneratorFactory() {
        super("binary");
    }

    @Override
    protected Optional<Generator> createFrom(final Map<String, Object> configuration) {
        return Optional.of(Generator.onlyMetrics(Generators.fromSingleInteger("value", Generators.binary())));
    }
}
