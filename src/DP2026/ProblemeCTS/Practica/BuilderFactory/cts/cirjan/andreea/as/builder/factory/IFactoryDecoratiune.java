package DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.factory;

import DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.model.ETipDecoratiune;

public interface IFactoryDecoratiune {
    IDecoratiune creareDecoratiune(ETipDecoratiune tip);
}
