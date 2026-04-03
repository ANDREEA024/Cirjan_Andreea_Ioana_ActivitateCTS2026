package DP2026.ProblemeCTS.Spital.A3.fabrici;

import DP2026.ProblemeCTS.Spital.A3.clase.ETipPersonal;
import DP2026.ProblemeCTS.Spital.A3.clase.PersonalSpital;

public interface IPersonalFactory {
    PersonalSpital createPersonal(ETipPersonal tip);
}
