// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class Currency
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Currency && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        @JvmField val AED = Currency(JsonField.of("AED"))

        @JvmField val AFN = Currency(JsonField.of("AFN"))

        @JvmField val ALL = Currency(JsonField.of("ALL"))

        @JvmField val AMD = Currency(JsonField.of("AMD"))

        @JvmField val ANG = Currency(JsonField.of("ANG"))

        @JvmField val AOA = Currency(JsonField.of("AOA"))

        @JvmField val ARS = Currency(JsonField.of("ARS"))

        @JvmField val AUD = Currency(JsonField.of("AUD"))

        @JvmField val AWG = Currency(JsonField.of("AWG"))

        @JvmField val AZN = Currency(JsonField.of("AZN"))

        @JvmField val BAM = Currency(JsonField.of("BAM"))

        @JvmField val BBD = Currency(JsonField.of("BBD"))

        @JvmField val BCH = Currency(JsonField.of("BCH"))

        @JvmField val BDT = Currency(JsonField.of("BDT"))

        @JvmField val BGN = Currency(JsonField.of("BGN"))

        @JvmField val BHD = Currency(JsonField.of("BHD"))

        @JvmField val BIF = Currency(JsonField.of("BIF"))

        @JvmField val BMD = Currency(JsonField.of("BMD"))

        @JvmField val BND = Currency(JsonField.of("BND"))

        @JvmField val BOB = Currency(JsonField.of("BOB"))

        @JvmField val BRL = Currency(JsonField.of("BRL"))

        @JvmField val BSD = Currency(JsonField.of("BSD"))

        @JvmField val BTC = Currency(JsonField.of("BTC"))

        @JvmField val BTN = Currency(JsonField.of("BTN"))

        @JvmField val BWP = Currency(JsonField.of("BWP"))

        @JvmField val BYN = Currency(JsonField.of("BYN"))

        @JvmField val BYR = Currency(JsonField.of("BYR"))

        @JvmField val BZD = Currency(JsonField.of("BZD"))

        @JvmField val CAD = Currency(JsonField.of("CAD"))

        @JvmField val CDF = Currency(JsonField.of("CDF"))

        @JvmField val CHF = Currency(JsonField.of("CHF"))

        @JvmField val CLF = Currency(JsonField.of("CLF"))

        @JvmField val CLP = Currency(JsonField.of("CLP"))

        @JvmField val CNH = Currency(JsonField.of("CNH"))

        @JvmField val CNY = Currency(JsonField.of("CNY"))

        @JvmField val COP = Currency(JsonField.of("COP"))

        @JvmField val CRC = Currency(JsonField.of("CRC"))

        @JvmField val CUC = Currency(JsonField.of("CUC"))

        @JvmField val CUP = Currency(JsonField.of("CUP"))

        @JvmField val CVE = Currency(JsonField.of("CVE"))

        @JvmField val CZK = Currency(JsonField.of("CZK"))

        @JvmField val DJF = Currency(JsonField.of("DJF"))

        @JvmField val DKK = Currency(JsonField.of("DKK"))

        @JvmField val DOP = Currency(JsonField.of("DOP"))

        @JvmField val DZD = Currency(JsonField.of("DZD"))

        @JvmField val EEK = Currency(JsonField.of("EEK"))

        @JvmField val EGP = Currency(JsonField.of("EGP"))

        @JvmField val ERN = Currency(JsonField.of("ERN"))

        @JvmField val ETB = Currency(JsonField.of("ETB"))

        @JvmField val EUR = Currency(JsonField.of("EUR"))

        @JvmField val FJD = Currency(JsonField.of("FJD"))

        @JvmField val FKP = Currency(JsonField.of("FKP"))

        @JvmField val GBP = Currency(JsonField.of("GBP"))

        @JvmField val GBX = Currency(JsonField.of("GBX"))

        @JvmField val GEL = Currency(JsonField.of("GEL"))

        @JvmField val GGP = Currency(JsonField.of("GGP"))

        @JvmField val GHS = Currency(JsonField.of("GHS"))

        @JvmField val GIP = Currency(JsonField.of("GIP"))

        @JvmField val GMD = Currency(JsonField.of("GMD"))

        @JvmField val GNF = Currency(JsonField.of("GNF"))

        @JvmField val GTQ = Currency(JsonField.of("GTQ"))

        @JvmField val GYD = Currency(JsonField.of("GYD"))

        @JvmField val HKD = Currency(JsonField.of("HKD"))

        @JvmField val HNL = Currency(JsonField.of("HNL"))

        @JvmField val HRK = Currency(JsonField.of("HRK"))

        @JvmField val HTG = Currency(JsonField.of("HTG"))

        @JvmField val HUF = Currency(JsonField.of("HUF"))

        @JvmField val IDR = Currency(JsonField.of("IDR"))

        @JvmField val ILS = Currency(JsonField.of("ILS"))

        @JvmField val IMP = Currency(JsonField.of("IMP"))

        @JvmField val INR = Currency(JsonField.of("INR"))

        @JvmField val IQD = Currency(JsonField.of("IQD"))

        @JvmField val IRR = Currency(JsonField.of("IRR"))

        @JvmField val ISK = Currency(JsonField.of("ISK"))

        @JvmField val JEP = Currency(JsonField.of("JEP"))

        @JvmField val JMD = Currency(JsonField.of("JMD"))

        @JvmField val JOD = Currency(JsonField.of("JOD"))

        @JvmField val JPY = Currency(JsonField.of("JPY"))

        @JvmField val KES = Currency(JsonField.of("KES"))

        @JvmField val KGS = Currency(JsonField.of("KGS"))

        @JvmField val KHR = Currency(JsonField.of("KHR"))

        @JvmField val KMF = Currency(JsonField.of("KMF"))

        @JvmField val KPW = Currency(JsonField.of("KPW"))

        @JvmField val KRW = Currency(JsonField.of("KRW"))

        @JvmField val KWD = Currency(JsonField.of("KWD"))

        @JvmField val KYD = Currency(JsonField.of("KYD"))

        @JvmField val KZT = Currency(JsonField.of("KZT"))

        @JvmField val LAK = Currency(JsonField.of("LAK"))

        @JvmField val LBP = Currency(JsonField.of("LBP"))

        @JvmField val LKR = Currency(JsonField.of("LKR"))

        @JvmField val LRD = Currency(JsonField.of("LRD"))

        @JvmField val LSL = Currency(JsonField.of("LSL"))

        @JvmField val LTL = Currency(JsonField.of("LTL"))

        @JvmField val LVL = Currency(JsonField.of("LVL"))

        @JvmField val LYD = Currency(JsonField.of("LYD"))

        @JvmField val MAD = Currency(JsonField.of("MAD"))

        @JvmField val MDL = Currency(JsonField.of("MDL"))

        @JvmField val MGA = Currency(JsonField.of("MGA"))

        @JvmField val MKD = Currency(JsonField.of("MKD"))

        @JvmField val MMK = Currency(JsonField.of("MMK"))

        @JvmField val MNT = Currency(JsonField.of("MNT"))

        @JvmField val MOP = Currency(JsonField.of("MOP"))

        @JvmField val MRO = Currency(JsonField.of("MRO"))

        @JvmField val MRU = Currency(JsonField.of("MRU"))

        @JvmField val MTL = Currency(JsonField.of("MTL"))

        @JvmField val MUR = Currency(JsonField.of("MUR"))

        @JvmField val MVR = Currency(JsonField.of("MVR"))

        @JvmField val MWK = Currency(JsonField.of("MWK"))

        @JvmField val MXN = Currency(JsonField.of("MXN"))

        @JvmField val MYR = Currency(JsonField.of("MYR"))

        @JvmField val MZN = Currency(JsonField.of("MZN"))

        @JvmField val NAD = Currency(JsonField.of("NAD"))

        @JvmField val NGN = Currency(JsonField.of("NGN"))

        @JvmField val NIO = Currency(JsonField.of("NIO"))

        @JvmField val NOK = Currency(JsonField.of("NOK"))

        @JvmField val NPR = Currency(JsonField.of("NPR"))

        @JvmField val NZD = Currency(JsonField.of("NZD"))

        @JvmField val OMR = Currency(JsonField.of("OMR"))

        @JvmField val PAB = Currency(JsonField.of("PAB"))

        @JvmField val PEN = Currency(JsonField.of("PEN"))

        @JvmField val PGK = Currency(JsonField.of("PGK"))

        @JvmField val PHP = Currency(JsonField.of("PHP"))

        @JvmField val PKR = Currency(JsonField.of("PKR"))

        @JvmField val PLN = Currency(JsonField.of("PLN"))

        @JvmField val PYG = Currency(JsonField.of("PYG"))

        @JvmField val QAR = Currency(JsonField.of("QAR"))

        @JvmField val RON = Currency(JsonField.of("RON"))

        @JvmField val RSD = Currency(JsonField.of("RSD"))

        @JvmField val RUB = Currency(JsonField.of("RUB"))

        @JvmField val RWF = Currency(JsonField.of("RWF"))

        @JvmField val SAR = Currency(JsonField.of("SAR"))

        @JvmField val SBD = Currency(JsonField.of("SBD"))

        @JvmField val SCR = Currency(JsonField.of("SCR"))

        @JvmField val SDG = Currency(JsonField.of("SDG"))

        @JvmField val SEK = Currency(JsonField.of("SEK"))

        @JvmField val SGD = Currency(JsonField.of("SGD"))

        @JvmField val SHP = Currency(JsonField.of("SHP"))

        @JvmField val SKK = Currency(JsonField.of("SKK"))

        @JvmField val SLL = Currency(JsonField.of("SLL"))

        @JvmField val SOS = Currency(JsonField.of("SOS"))

        @JvmField val SRD = Currency(JsonField.of("SRD"))

        @JvmField val SSP = Currency(JsonField.of("SSP"))

        @JvmField val STD = Currency(JsonField.of("STD"))

        @JvmField val SVC = Currency(JsonField.of("SVC"))

        @JvmField val SYP = Currency(JsonField.of("SYP"))

        @JvmField val SZL = Currency(JsonField.of("SZL"))

        @JvmField val THB = Currency(JsonField.of("THB"))

        @JvmField val TJS = Currency(JsonField.of("TJS"))

        @JvmField val TMM = Currency(JsonField.of("TMM"))

        @JvmField val TMT = Currency(JsonField.of("TMT"))

        @JvmField val TND = Currency(JsonField.of("TND"))

        @JvmField val TOP = Currency(JsonField.of("TOP"))

        @JvmField val TRY = Currency(JsonField.of("TRY"))

        @JvmField val TTD = Currency(JsonField.of("TTD"))

        @JvmField val TWD = Currency(JsonField.of("TWD"))

        @JvmField val TZS = Currency(JsonField.of("TZS"))

        @JvmField val UAH = Currency(JsonField.of("UAH"))

        @JvmField val UGX = Currency(JsonField.of("UGX"))

        @JvmField val USD = Currency(JsonField.of("USD"))

        @JvmField val UYU = Currency(JsonField.of("UYU"))

        @JvmField val UZS = Currency(JsonField.of("UZS"))

        @JvmField val VEF = Currency(JsonField.of("VEF"))

        @JvmField val VES = Currency(JsonField.of("VES"))

        @JvmField val VND = Currency(JsonField.of("VND"))

        @JvmField val VUV = Currency(JsonField.of("VUV"))

        @JvmField val WST = Currency(JsonField.of("WST"))

        @JvmField val XAF = Currency(JsonField.of("XAF"))

        @JvmField val XAG = Currency(JsonField.of("XAG"))

        @JvmField val XAU = Currency(JsonField.of("XAU"))

        @JvmField val XBA = Currency(JsonField.of("XBA"))

        @JvmField val XBB = Currency(JsonField.of("XBB"))

        @JvmField val XBC = Currency(JsonField.of("XBC"))

        @JvmField val XBD = Currency(JsonField.of("XBD"))

        @JvmField val XCD = Currency(JsonField.of("XCD"))

        @JvmField val XDR = Currency(JsonField.of("XDR"))

        @JvmField val XFU = Currency(JsonField.of("XFU"))

        @JvmField val XOF = Currency(JsonField.of("XOF"))

        @JvmField val XPD = Currency(JsonField.of("XPD"))

        @JvmField val XPF = Currency(JsonField.of("XPF"))

        @JvmField val XPT = Currency(JsonField.of("XPT"))

        @JvmField val XTS = Currency(JsonField.of("XTS"))

        @JvmField val YER = Currency(JsonField.of("YER"))

        @JvmField val ZAR = Currency(JsonField.of("ZAR"))

        @JvmField val ZMK = Currency(JsonField.of("ZMK"))

        @JvmField val ZMW = Currency(JsonField.of("ZMW"))

        @JvmField val ZWD = Currency(JsonField.of("ZWD"))

        @JvmField val ZWL = Currency(JsonField.of("ZWL"))

        @JvmField val ZWN = Currency(JsonField.of("ZWN"))

        @JvmField val ZWR = Currency(JsonField.of("ZWR"))

        @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
    }

    enum class Known {
        AED,
        AFN,
        ALL,
        AMD,
        ANG,
        AOA,
        ARS,
        AUD,
        AWG,
        AZN,
        BAM,
        BBD,
        BCH,
        BDT,
        BGN,
        BHD,
        BIF,
        BMD,
        BND,
        BOB,
        BRL,
        BSD,
        BTC,
        BTN,
        BWP,
        BYN,
        BYR,
        BZD,
        CAD,
        CDF,
        CHF,
        CLF,
        CLP,
        CNH,
        CNY,
        COP,
        CRC,
        CUC,
        CUP,
        CVE,
        CZK,
        DJF,
        DKK,
        DOP,
        DZD,
        EEK,
        EGP,
        ERN,
        ETB,
        EUR,
        FJD,
        FKP,
        GBP,
        GBX,
        GEL,
        GGP,
        GHS,
        GIP,
        GMD,
        GNF,
        GTQ,
        GYD,
        HKD,
        HNL,
        HRK,
        HTG,
        HUF,
        IDR,
        ILS,
        IMP,
        INR,
        IQD,
        IRR,
        ISK,
        JEP,
        JMD,
        JOD,
        JPY,
        KES,
        KGS,
        KHR,
        KMF,
        KPW,
        KRW,
        KWD,
        KYD,
        KZT,
        LAK,
        LBP,
        LKR,
        LRD,
        LSL,
        LTL,
        LVL,
        LYD,
        MAD,
        MDL,
        MGA,
        MKD,
        MMK,
        MNT,
        MOP,
        MRO,
        MRU,
        MTL,
        MUR,
        MVR,
        MWK,
        MXN,
        MYR,
        MZN,
        NAD,
        NGN,
        NIO,
        NOK,
        NPR,
        NZD,
        OMR,
        PAB,
        PEN,
        PGK,
        PHP,
        PKR,
        PLN,
        PYG,
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
        SBD,
        SCR,
        SDG,
        SEK,
        SGD,
        SHP,
        SKK,
        SLL,
        SOS,
        SRD,
        SSP,
        STD,
        SVC,
        SYP,
        SZL,
        THB,
        TJS,
        TMM,
        TMT,
        TND,
        TOP,
        TRY,
        TTD,
        TWD,
        TZS,
        UAH,
        UGX,
        USD,
        UYU,
        UZS,
        VEF,
        VES,
        VND,
        VUV,
        WST,
        XAF,
        XAG,
        XAU,
        XBA,
        XBB,
        XBC,
        XBD,
        XCD,
        XDR,
        XFU,
        XOF,
        XPD,
        XPF,
        XPT,
        XTS,
        YER,
        ZAR,
        ZMK,
        ZMW,
        ZWD,
        ZWL,
        ZWN,
        ZWR,
    }

    enum class Value {
        AED,
        AFN,
        ALL,
        AMD,
        ANG,
        AOA,
        ARS,
        AUD,
        AWG,
        AZN,
        BAM,
        BBD,
        BCH,
        BDT,
        BGN,
        BHD,
        BIF,
        BMD,
        BND,
        BOB,
        BRL,
        BSD,
        BTC,
        BTN,
        BWP,
        BYN,
        BYR,
        BZD,
        CAD,
        CDF,
        CHF,
        CLF,
        CLP,
        CNH,
        CNY,
        COP,
        CRC,
        CUC,
        CUP,
        CVE,
        CZK,
        DJF,
        DKK,
        DOP,
        DZD,
        EEK,
        EGP,
        ERN,
        ETB,
        EUR,
        FJD,
        FKP,
        GBP,
        GBX,
        GEL,
        GGP,
        GHS,
        GIP,
        GMD,
        GNF,
        GTQ,
        GYD,
        HKD,
        HNL,
        HRK,
        HTG,
        HUF,
        IDR,
        ILS,
        IMP,
        INR,
        IQD,
        IRR,
        ISK,
        JEP,
        JMD,
        JOD,
        JPY,
        KES,
        KGS,
        KHR,
        KMF,
        KPW,
        KRW,
        KWD,
        KYD,
        KZT,
        LAK,
        LBP,
        LKR,
        LRD,
        LSL,
        LTL,
        LVL,
        LYD,
        MAD,
        MDL,
        MGA,
        MKD,
        MMK,
        MNT,
        MOP,
        MRO,
        MRU,
        MTL,
        MUR,
        MVR,
        MWK,
        MXN,
        MYR,
        MZN,
        NAD,
        NGN,
        NIO,
        NOK,
        NPR,
        NZD,
        OMR,
        PAB,
        PEN,
        PGK,
        PHP,
        PKR,
        PLN,
        PYG,
        QAR,
        RON,
        RSD,
        RUB,
        RWF,
        SAR,
        SBD,
        SCR,
        SDG,
        SEK,
        SGD,
        SHP,
        SKK,
        SLL,
        SOS,
        SRD,
        SSP,
        STD,
        SVC,
        SYP,
        SZL,
        THB,
        TJS,
        TMM,
        TMT,
        TND,
        TOP,
        TRY,
        TTD,
        TWD,
        TZS,
        UAH,
        UGX,
        USD,
        UYU,
        UZS,
        VEF,
        VES,
        VND,
        VUV,
        WST,
        XAF,
        XAG,
        XAU,
        XBA,
        XBB,
        XBC,
        XBD,
        XCD,
        XDR,
        XFU,
        XOF,
        XPD,
        XPF,
        XPT,
        XTS,
        YER,
        ZAR,
        ZMK,
        ZMW,
        ZWD,
        ZWL,
        ZWN,
        ZWR,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            AED -> Value.AED
            AFN -> Value.AFN
            ALL -> Value.ALL
            AMD -> Value.AMD
            ANG -> Value.ANG
            AOA -> Value.AOA
            ARS -> Value.ARS
            AUD -> Value.AUD
            AWG -> Value.AWG
            AZN -> Value.AZN
            BAM -> Value.BAM
            BBD -> Value.BBD
            BCH -> Value.BCH
            BDT -> Value.BDT
            BGN -> Value.BGN
            BHD -> Value.BHD
            BIF -> Value.BIF
            BMD -> Value.BMD
            BND -> Value.BND
            BOB -> Value.BOB
            BRL -> Value.BRL
            BSD -> Value.BSD
            BTC -> Value.BTC
            BTN -> Value.BTN
            BWP -> Value.BWP
            BYN -> Value.BYN
            BYR -> Value.BYR
            BZD -> Value.BZD
            CAD -> Value.CAD
            CDF -> Value.CDF
            CHF -> Value.CHF
            CLF -> Value.CLF
            CLP -> Value.CLP
            CNH -> Value.CNH
            CNY -> Value.CNY
            COP -> Value.COP
            CRC -> Value.CRC
            CUC -> Value.CUC
            CUP -> Value.CUP
            CVE -> Value.CVE
            CZK -> Value.CZK
            DJF -> Value.DJF
            DKK -> Value.DKK
            DOP -> Value.DOP
            DZD -> Value.DZD
            EEK -> Value.EEK
            EGP -> Value.EGP
            ERN -> Value.ERN
            ETB -> Value.ETB
            EUR -> Value.EUR
            FJD -> Value.FJD
            FKP -> Value.FKP
            GBP -> Value.GBP
            GBX -> Value.GBX
            GEL -> Value.GEL
            GGP -> Value.GGP
            GHS -> Value.GHS
            GIP -> Value.GIP
            GMD -> Value.GMD
            GNF -> Value.GNF
            GTQ -> Value.GTQ
            GYD -> Value.GYD
            HKD -> Value.HKD
            HNL -> Value.HNL
            HRK -> Value.HRK
            HTG -> Value.HTG
            HUF -> Value.HUF
            IDR -> Value.IDR
            ILS -> Value.ILS
            IMP -> Value.IMP
            INR -> Value.INR
            IQD -> Value.IQD
            IRR -> Value.IRR
            ISK -> Value.ISK
            JEP -> Value.JEP
            JMD -> Value.JMD
            JOD -> Value.JOD
            JPY -> Value.JPY
            KES -> Value.KES
            KGS -> Value.KGS
            KHR -> Value.KHR
            KMF -> Value.KMF
            KPW -> Value.KPW
            KRW -> Value.KRW
            KWD -> Value.KWD
            KYD -> Value.KYD
            KZT -> Value.KZT
            LAK -> Value.LAK
            LBP -> Value.LBP
            LKR -> Value.LKR
            LRD -> Value.LRD
            LSL -> Value.LSL
            LTL -> Value.LTL
            LVL -> Value.LVL
            LYD -> Value.LYD
            MAD -> Value.MAD
            MDL -> Value.MDL
            MGA -> Value.MGA
            MKD -> Value.MKD
            MMK -> Value.MMK
            MNT -> Value.MNT
            MOP -> Value.MOP
            MRO -> Value.MRO
            MRU -> Value.MRU
            MTL -> Value.MTL
            MUR -> Value.MUR
            MVR -> Value.MVR
            MWK -> Value.MWK
            MXN -> Value.MXN
            MYR -> Value.MYR
            MZN -> Value.MZN
            NAD -> Value.NAD
            NGN -> Value.NGN
            NIO -> Value.NIO
            NOK -> Value.NOK
            NPR -> Value.NPR
            NZD -> Value.NZD
            OMR -> Value.OMR
            PAB -> Value.PAB
            PEN -> Value.PEN
            PGK -> Value.PGK
            PHP -> Value.PHP
            PKR -> Value.PKR
            PLN -> Value.PLN
            PYG -> Value.PYG
            QAR -> Value.QAR
            RON -> Value.RON
            RSD -> Value.RSD
            RUB -> Value.RUB
            RWF -> Value.RWF
            SAR -> Value.SAR
            SBD -> Value.SBD
            SCR -> Value.SCR
            SDG -> Value.SDG
            SEK -> Value.SEK
            SGD -> Value.SGD
            SHP -> Value.SHP
            SKK -> Value.SKK
            SLL -> Value.SLL
            SOS -> Value.SOS
            SRD -> Value.SRD
            SSP -> Value.SSP
            STD -> Value.STD
            SVC -> Value.SVC
            SYP -> Value.SYP
            SZL -> Value.SZL
            THB -> Value.THB
            TJS -> Value.TJS
            TMM -> Value.TMM
            TMT -> Value.TMT
            TND -> Value.TND
            TOP -> Value.TOP
            TRY -> Value.TRY
            TTD -> Value.TTD
            TWD -> Value.TWD
            TZS -> Value.TZS
            UAH -> Value.UAH
            UGX -> Value.UGX
            USD -> Value.USD
            UYU -> Value.UYU
            UZS -> Value.UZS
            VEF -> Value.VEF
            VES -> Value.VES
            VND -> Value.VND
            VUV -> Value.VUV
            WST -> Value.WST
            XAF -> Value.XAF
            XAG -> Value.XAG
            XAU -> Value.XAU
            XBA -> Value.XBA
            XBB -> Value.XBB
            XBC -> Value.XBC
            XBD -> Value.XBD
            XCD -> Value.XCD
            XDR -> Value.XDR
            XFU -> Value.XFU
            XOF -> Value.XOF
            XPD -> Value.XPD
            XPF -> Value.XPF
            XPT -> Value.XPT
            XTS -> Value.XTS
            YER -> Value.YER
            ZAR -> Value.ZAR
            ZMK -> Value.ZMK
            ZMW -> Value.ZMW
            ZWD -> Value.ZWD
            ZWL -> Value.ZWL
            ZWN -> Value.ZWN
            ZWR -> Value.ZWR
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            AED -> Known.AED
            AFN -> Known.AFN
            ALL -> Known.ALL
            AMD -> Known.AMD
            ANG -> Known.ANG
            AOA -> Known.AOA
            ARS -> Known.ARS
            AUD -> Known.AUD
            AWG -> Known.AWG
            AZN -> Known.AZN
            BAM -> Known.BAM
            BBD -> Known.BBD
            BCH -> Known.BCH
            BDT -> Known.BDT
            BGN -> Known.BGN
            BHD -> Known.BHD
            BIF -> Known.BIF
            BMD -> Known.BMD
            BND -> Known.BND
            BOB -> Known.BOB
            BRL -> Known.BRL
            BSD -> Known.BSD
            BTC -> Known.BTC
            BTN -> Known.BTN
            BWP -> Known.BWP
            BYN -> Known.BYN
            BYR -> Known.BYR
            BZD -> Known.BZD
            CAD -> Known.CAD
            CDF -> Known.CDF
            CHF -> Known.CHF
            CLF -> Known.CLF
            CLP -> Known.CLP
            CNH -> Known.CNH
            CNY -> Known.CNY
            COP -> Known.COP
            CRC -> Known.CRC
            CUC -> Known.CUC
            CUP -> Known.CUP
            CVE -> Known.CVE
            CZK -> Known.CZK
            DJF -> Known.DJF
            DKK -> Known.DKK
            DOP -> Known.DOP
            DZD -> Known.DZD
            EEK -> Known.EEK
            EGP -> Known.EGP
            ERN -> Known.ERN
            ETB -> Known.ETB
            EUR -> Known.EUR
            FJD -> Known.FJD
            FKP -> Known.FKP
            GBP -> Known.GBP
            GBX -> Known.GBX
            GEL -> Known.GEL
            GGP -> Known.GGP
            GHS -> Known.GHS
            GIP -> Known.GIP
            GMD -> Known.GMD
            GNF -> Known.GNF
            GTQ -> Known.GTQ
            GYD -> Known.GYD
            HKD -> Known.HKD
            HNL -> Known.HNL
            HRK -> Known.HRK
            HTG -> Known.HTG
            HUF -> Known.HUF
            IDR -> Known.IDR
            ILS -> Known.ILS
            IMP -> Known.IMP
            INR -> Known.INR
            IQD -> Known.IQD
            IRR -> Known.IRR
            ISK -> Known.ISK
            JEP -> Known.JEP
            JMD -> Known.JMD
            JOD -> Known.JOD
            JPY -> Known.JPY
            KES -> Known.KES
            KGS -> Known.KGS
            KHR -> Known.KHR
            KMF -> Known.KMF
            KPW -> Known.KPW
            KRW -> Known.KRW
            KWD -> Known.KWD
            KYD -> Known.KYD
            KZT -> Known.KZT
            LAK -> Known.LAK
            LBP -> Known.LBP
            LKR -> Known.LKR
            LRD -> Known.LRD
            LSL -> Known.LSL
            LTL -> Known.LTL
            LVL -> Known.LVL
            LYD -> Known.LYD
            MAD -> Known.MAD
            MDL -> Known.MDL
            MGA -> Known.MGA
            MKD -> Known.MKD
            MMK -> Known.MMK
            MNT -> Known.MNT
            MOP -> Known.MOP
            MRO -> Known.MRO
            MRU -> Known.MRU
            MTL -> Known.MTL
            MUR -> Known.MUR
            MVR -> Known.MVR
            MWK -> Known.MWK
            MXN -> Known.MXN
            MYR -> Known.MYR
            MZN -> Known.MZN
            NAD -> Known.NAD
            NGN -> Known.NGN
            NIO -> Known.NIO
            NOK -> Known.NOK
            NPR -> Known.NPR
            NZD -> Known.NZD
            OMR -> Known.OMR
            PAB -> Known.PAB
            PEN -> Known.PEN
            PGK -> Known.PGK
            PHP -> Known.PHP
            PKR -> Known.PKR
            PLN -> Known.PLN
            PYG -> Known.PYG
            QAR -> Known.QAR
            RON -> Known.RON
            RSD -> Known.RSD
            RUB -> Known.RUB
            RWF -> Known.RWF
            SAR -> Known.SAR
            SBD -> Known.SBD
            SCR -> Known.SCR
            SDG -> Known.SDG
            SEK -> Known.SEK
            SGD -> Known.SGD
            SHP -> Known.SHP
            SKK -> Known.SKK
            SLL -> Known.SLL
            SOS -> Known.SOS
            SRD -> Known.SRD
            SSP -> Known.SSP
            STD -> Known.STD
            SVC -> Known.SVC
            SYP -> Known.SYP
            SZL -> Known.SZL
            THB -> Known.THB
            TJS -> Known.TJS
            TMM -> Known.TMM
            TMT -> Known.TMT
            TND -> Known.TND
            TOP -> Known.TOP
            TRY -> Known.TRY
            TTD -> Known.TTD
            TWD -> Known.TWD
            TZS -> Known.TZS
            UAH -> Known.UAH
            UGX -> Known.UGX
            USD -> Known.USD
            UYU -> Known.UYU
            UZS -> Known.UZS
            VEF -> Known.VEF
            VES -> Known.VES
            VND -> Known.VND
            VUV -> Known.VUV
            WST -> Known.WST
            XAF -> Known.XAF
            XAG -> Known.XAG
            XAU -> Known.XAU
            XBA -> Known.XBA
            XBB -> Known.XBB
            XBC -> Known.XBC
            XBD -> Known.XBD
            XCD -> Known.XCD
            XDR -> Known.XDR
            XFU -> Known.XFU
            XOF -> Known.XOF
            XPD -> Known.XPD
            XPF -> Known.XPF
            XPT -> Known.XPT
            XTS -> Known.XTS
            YER -> Known.YER
            ZAR -> Known.ZAR
            ZMK -> Known.ZMK
            ZMW -> Known.ZMW
            ZWD -> Known.ZWD
            ZWL -> Known.ZWL
            ZWN -> Known.ZWN
            ZWR -> Known.ZWR
            else -> throw ModernTreasuryInvalidDataException("Unknown Currency: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
