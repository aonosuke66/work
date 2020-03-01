/**
 * @(#)Sample_ja.java 2013/02/06 SVF for PDF Sample Program
 */
 
import jp.co.fit.vfreport.*;
import java.util.ArrayList;
import java.util.List;
 
public class MigrationTest {

    public static void main(String[] args) {
    	
        int ret;
        List<DataBean> list = new ArrayList<>();
        
        DataBean dataBean1 = new DataBean();
        dataBean1.setInf6xMsg("0");
        dataBean1.setKeyValue1("1234");
        dataBean1.setKeyValue2("テスト支店名");
        dataBean1.setSokinKngk("123000000000");
        dataBean1.setKozaNmbrHyzKbn("0");
        dataBean1.setOutputNo("KNJB12338");
        dataBean1.setKizyunYmd1("20200227");
        dataBean1.setKizyunYmd2("20200227");
        dataBean1.setHaihuBtn("1234");
        dataBean1.setTktBtn("1234");
        dataBean1.setSaksYmd("20200227");
        dataBean1.setAtksyHyzKbn("1");
        dataBean1.setYokuEigyYmd("20200228");
        dataBean1.setAtksyCd("12345");
        dataBean1.setKkykCd("1234567");
        dataBean1.setKkykMeiKnz("テスト顧客名");
        dataBean1.setHssSokinKngk("123000000000");
        dataBean1.setRinkinMrk(" ");
        dataBean1.setDnwBng("12-3456-7890");
        dataBean1.setSmkGnkCd("1234");
        dataBean1.setSmkStnCd("123");
        dataBean1.setSmkGnkMeiKnz("テスト仕向銀行名");
        dataBean1.setSmkStnMeiKnz("テスト仕向支店名");
        dataBean1.setSokinKngkKozaGokei("123000000000");
        dataBean1.setZysknKinyInstttCd("9876");
        dataBean1.setZysknKinyInstttTnpCd("987");
        dataBean1.setZysknKinyInstttKoyuKnz("テスト送金先銀行名");
        dataBean1.setZysknKinyInstttTnpMeiKnz("テスト送金支店名");
        dataBean1.setZysknKinyInstttYknSymk("2");
        dataBean1.setZysknKinyInstttKozaNmbr("1");
        dataBean1.setKozaMeigninMeiKnz("口座名カナ");
        dataBean1.setHssKingkZntnGokei("123000000000");
        dataBean1.setMeisKnsZntnGokei("1");
        dataBean1.setHssSokinKngkZntnGokei("123000000000");
        
        list.add(dataBean1);
        
        DataBean dataBean2 = new DataBean();
        dataBean2.setSokinKngk("123000000000");
        dataBean2.setKozaNmbrHyzKbn("0");
        dataBean2.setAtksyHyzKbn("1");
        dataBean2.setAtksyCd("12345");
        dataBean2.setKkykCd("1234567");
        dataBean2.setKkykMeiKnz("テスト顧客名");
        dataBean2.setHssSokinKngk("123000000000");
        dataBean2.setRinkinMrk(" ");
        dataBean2.setDnwBng("12-3456-7890");
        dataBean2.setSmkGnkCd("");
        dataBean2.setSmkStnCd("");
        dataBean2.setSmkGnkMeiKnz("");
        dataBean2.setSmkStnMeiKnz("");
        dataBean2.setSokinKngkKozaGokei("123000000000");
        dataBean2.setZysknKinyInstttCd("9876");
        dataBean2.setZysknKinyInstttTnpCd("987");
        dataBean2.setZysknKinyInstttKoyuKnz("");
        dataBean2.setZysknKinyInstttTnpMeiKnz("");
        dataBean2.setZysknKinyInstttYknSymk("");
        dataBean2.setZysknKinyInstttKozaNmbr("");
        dataBean2.setKozaMeigninMeiKnz("");
        dataBean2.setHssKingkZntnGokei("123000000000");
        dataBean2.setMeisKnsZntnGokei("1");
        dataBean2.setHssSokinKngkZntnGokei("123000000000");
        
        list.add(dataBean2);
        
        DataBean dataBean3 = new DataBean();
        dataBean3.setSokinKngk("234000000000");
        dataBean3.setKozaNmbrHyzKbn("0");
        dataBean3.setAtksyHyzKbn("1");
        dataBean3.setAtksyCd("23456");
        dataBean3.setKkykCd("2345678");
        dataBean3.setKkykMeiKnz("テスト顧客名２");
        dataBean3.setHssSokinKngk("234000000000");
        dataBean3.setRinkinMrk(" ");
        dataBean3.setDnwBng("23-4567-8901");
        dataBean3.setSmkGnkCd("2345");
        dataBean3.setSmkStnCd("234");
        dataBean3.setSmkGnkMeiKnz("テスト仕向銀行名２");
        dataBean3.setSmkStnMeiKnz("テスト仕向支店名２");
        dataBean3.setSokinKngkKozaGokei("234000000000");
        dataBean3.setZysknKinyInstttCd("8765");
        dataBean3.setZysknKinyInstttTnpCd("876");
        dataBean3.setZysknKinyInstttKoyuKnz("テスト送金先銀行名２");
        dataBean3.setZysknKinyInstttTnpMeiKnz("テスト送金支店名２");
        dataBean3.setZysknKinyInstttYknSymk("3");
        dataBean3.setZysknKinyInstttKozaNmbr("2");
        dataBean3.setKozaMeigninMeiKnz("口座名カナ２");
        dataBean3.setHssKingkZntnGokei("234000000000");
        dataBean3.setMeisKnsZntnGokei("1");
        dataBean3.setHssSokinKngkZntnGokei("234000000000");
        
        list.add(dataBean3);
        
        DataBean dataBean4 = new DataBean();
        dataBean4.setSokinKngk("234000000000");
        dataBean4.setKozaNmbrHyzKbn("0");
        dataBean4.setAtksyHyzKbn("1");
        dataBean4.setAtksyCd("23456");
        dataBean4.setKkykCd("2345678");
        dataBean4.setKkykMeiKnz("テスト顧客名２");
        dataBean4.setHssSokinKngk("234000000000");
        dataBean4.setRinkinMrk(" ");
        dataBean4.setDnwBng("23-4567-8901");
        dataBean4.setSmkGnkCd("");
        dataBean4.setSmkStnCd("");
        dataBean4.setSmkGnkMeiKnz("");
        dataBean4.setSmkStnMeiKnz("");
        dataBean4.setSokinKngkKozaGokei("234000000000");
        dataBean4.setZysknKinyInstttCd("");
        dataBean4.setZysknKinyInstttTnpCd("");
        dataBean4.setZysknKinyInstttKoyuKnz("");
        dataBean4.setZysknKinyInstttTnpMeiKnz("");
        dataBean4.setZysknKinyInstttYknSymk("");
        dataBean4.setZysknKinyInstttKozaNmbr("");
        dataBean4.setKozaMeigninMeiKnz("");
        dataBean4.setHssKingkZntnGokei("234000000000");
        dataBean4.setMeisKnsZntnGokei("1");
        dataBean4.setHssSokinKngkZntnGokei("234000000000");
        
        list.add(dataBean4);
        
        DataBean dataBean5 = new DataBean();
        dataBean5.setSokinKngk("234000000000");
        dataBean5.setKozaNmbrHyzKbn("0");
        dataBean5.setAtksyHyzKbn("1");
        dataBean5.setAtksyCd("23456");
        dataBean5.setKkykCd("2345678");
        dataBean5.setKkykMeiKnz("テスト顧客名２");
        dataBean5.setHssSokinKngk("234000000000");
        dataBean5.setRinkinMrk(" ");
        dataBean5.setDnwBng("23-4567-8901");
        dataBean5.setSmkGnkCd("");
        dataBean5.setSmkStnCd("");
        dataBean5.setSmkGnkMeiKnz("");
        dataBean5.setSmkStnMeiKnz("");
        dataBean5.setSokinKngkKozaGokei("234000000000");
        dataBean5.setZysknKinyInstttCd("");
        dataBean5.setZysknKinyInstttTnpCd("");
        dataBean5.setZysknKinyInstttKoyuKnz("");
        dataBean5.setZysknKinyInstttTnpMeiKnz("");
        dataBean5.setZysknKinyInstttYknSymk("");
        dataBean5.setZysknKinyInstttKozaNmbr("");
        dataBean5.setKozaMeigninMeiKnz("");
        dataBean5.setHssKingkZntnGokei("234000000000");
        dataBean5.setMeisKnsZntnGokei("1");
        dataBean5.setHssSokinKngkZntnGokei("234000000000");
        
        list.add(dataBean5);
        
        ret = PDFConvertService("/home/svf/KNJB12338Z001.xml", list);
        System.out.printf("return=%d\n", ret);
    }
    
    private static int PDFConvertService(String layoutFileName, List<DataBean> list) {
        int ret;
        Vrw32 svf = new Vrw32();
        
        svf.VrSetLocale("ja");
        svf.VrInit("MS932");
        svf.VrSetPrinter("", "PDF");
        svf.VrSetSpoolFileName2("/home/svf/KNJB12338Z001.pdf");
        svf.VrSetForm(layoutFileName, 4);
        
        DataBean firstBean = list.get(0);
    
        svf.VrsOut("INF6X_MSG", firstBean.getInf6xMsg());
        svf.VrsOut("KEY_VALUE1", firstBean.getKeyValue1());
        svf.VrsOut("KEY_VALUE2", firstBean.getKeyValue2());
        svf.VrsOut("OUTPUT_NO", firstBean.getOutputNo());
        svf.VrsOut("KIZYUN_YMD1", firstBean.getKizyunYmd1());
        svf.VrsOut("KIZYUN_YMD2", firstBean.getKizyunYmd2());
        svf.VrsOut("HAIHU_BTN", firstBean.getHaihuBtn());
        svf.VrsOut("TKT_BTN", firstBean.getTktBtn());
        svf.VrsOut("SAKS_YMD", firstBean.getSaksYmd());
        svf.VrsOut("YOKU_EIGY_YMD", firstBean.getYokuEigyYmd());
        
        for(DataBean dataBean : list) {
            svf.VrsOut("SOKIN_KNGK", dataBean.getSokinKngk());
            svf.VrsOut("KOZA_NMBR_HYZ_KBN", dataBean.getKozaNmbrHyzKbn());
            svf.VrsOut("ATKSY_HYZ_KBN", dataBean.getAtksyHyzKbn());
            svf.VrsOut("ATKSY_CD", dataBean.getAtksyCd());
            svf.VrsOut("KKYK_CD", dataBean.getKkykCd());
            svf.VrsOut("KKYK_MEI_KNZ", dataBean.getKkykMeiKnz());
            svf.VrsOut("HSS_SOKIN_KNGK", dataBean.getHssSokinKngk());
            svf.VrsOut("RINKIN_MRK", dataBean.getRinkinMrk());
            svf.VrsOut("DNWBNG", dataBean.getDnwBng());
            svf.VrsOut("SMK_GNK_CD", dataBean.getSmkGnkCd());
            svf.VrsOut("SMK_STN_CD", dataBean.getSmkStnCd());
            svf.VrsOut("SMK_GNK_MEI_KNZ", dataBean.getSmkGnkMeiKnz());
            svf.VrsOut("SMK_STN_MEI_KNZ", dataBean.getSmkStnMeiKnz());
            svf.VrsOut("SOKIN_KNGK_KOZA_GOKEI", dataBean.getSokinKngkKozaGokei());
            svf.VrsOut("ZYSKN_KINY_INSTTT_CD", dataBean.getZysknKinyInstttCd());
            svf.VrsOut("ZYSKN_KINY_INSTTT_TNP_CD", dataBean.getZysknKinyInstttTnpCd());
            svf.VrsOut("ZYSKN_KINY_INSTTT_MEI_KOYU_KNZ", dataBean.getZysknKinyInstttKoyuKnz());
            svf.VrsOut("ZYSKN_KINY_INSTTT_TNP_MEI_KNZ", dataBean.getZysknKinyInstttTnpMeiKnz());
            svf.VrsOut("ZYSKN_KINY_INSTTT_YKN_SYMK", dataBean.getZysknKinyInstttYknSymk());
            svf.VrsOut("ZYSKN_KINY_INSTTT_KOZA_NMBR", dataBean.getZysknKinyInstttKozaNmbr());
            svf.VrsOut("KOZA_MEIGNIN_MEI_KNZ", dataBean.getKozaMeigninMeiKnz());
            svf.VrsOut("HSS_KNGK_ZNTN_GOKEI", dataBean.getHssKngkZntnGokei());
            svf.VrsOut("MEIS_KNS_ZNTN_GOKEI", dataBean.getMeisKnsZntnGokei());
            svf.VrsOut("HSS_SOKIN_KNGK_ZNTN_GOKEI", dataBean.getHssSokinKngkZntnGokei());
            svf.VrEndRecord();
        }
        
        svf.VrPrint();
        ret = svf.VrQuit();
        
        return ret;
    }
}