package DP2026.ProblemeCTS.Practica.BuilderFactory.cts.cirjan.andreea.as.builder.model;

import java.util.List;

public abstract class ABuchet {

        protected ETipAmbalaj tipAmbalaj;
        protected int numarFlori;
        protected ETipFloare floarePrincipala;
        protected String culoareDominanta;

        protected List<ETipFloare> floriSuplimentare;
        protected List<String> mesajePersonalizate;
        protected List<ETipDecoratiune> decoratiuni;

        public abstract float calculPret();
        public abstract void addFloareSuplimentara(ETipFloare floare);
        public abstract void addDecoratiune(String decoratiune);
        public abstract void addMesaj(String mesaj);
    }
