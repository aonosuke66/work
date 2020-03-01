/**
 * @(#)Sample_ja.java 2013/02/06 SVF for PDF Sample Program
 */
 
import jp.co.fit.vfreport.*;
import java.util.ArrayList;
import java.util.List;
 
public class MigrationTestDataZero {

    public static void main(String[] args) {
    	
        int ret;
        List<DataBean> list = new ArrayList<>();
        
        DataBean dataBean = new DataBean();
        dataBean.setInf6xMsg("1");
        dataBean.setKeyValue1("");
        dataBean.setKeyValue2("");
        dataBean.setSokinKngk("");
        dataBean.setKozaNmbrHyzKbn("");
        dataBean.setOutputNo("");
        dataBean.setKizyunYmd2("");
        dataBean.setHaihuBtn("");
        dataBean.setTktBtn("");
        dataBean.setSaksYmd("");
        dataBean.setAtksyHyzKbn("");
        dataBean.setYokuEigyYmd("");
        dataBean.setAtksyCd("");
        dataBean.setKkykCd("");
        dataBean.setKkykMeiKnz("");
        dataBean.setHssSokinKngk("");
        dataBean.setRinkinMrk("");
        dataBean.setDnwBng("");
        dataBean.setSmkGnkCd("");
        dataBean.setSmkStnCd("");
        dataBean.setSmkGnkMeiKnz("");
        dataBean.setSmkStnMeiKnz("");
        dataBean.setSokinKngkKozaGokei("");
        dataBean.setZysknKinyInstttCd("");
        dataBean.setZysknKinyInstttTnpCd("");
        dataBean.setZysknKinyInstttKoyuKnz("");
        dataBean.setZysknKinyInstttTnpMeiKnz("");
        dataBean.setZysknKinyInstttYknSymk("");
        dataBean.setZysknKinyInstttKozaNmbr("");
        dataBean.setKozaMeigninMeiKnz("");
        dataBean.setHssKingkZntnGokei("");
        dataBean.setMeisKnsZntnGokei("");
        dataBean.setHssSokinKngkZntnGokei("");
        
        list.add(dataBean);
        
        ret = PDFConvertService("/home/svf/KNJB12338Z001.xml", list);
        System.out.printf("return=%d\n", ret);
    }
    
    private static int PDFConvertService(String layoutFileName, List<DataBean> list) {
        int ret;
        Vrw32 svf = new Vrw32();
        
        svf.VrSetLocale("ja");
        svf.VrInit("MS932");
        svf.VrSetPrinter("", "PDF");
        svf.VrSetSpoolFileName2("/home/svf/KNJB12338Z001_data_zero.pdf");
        svf.VrSetForm(layoutFileName, 4);
        
        DataBean firstBean = list.get(0);
    
        svf.VrsOut("INF6X_MSG", firstBean.getInf6xMsg());
        svf.VrsOut("KEY_VALUE1", firstBean.getKeyValue1());
        svf.VrsOut("KEY_VALUE2", firstBean.getKeyValue2());
        svf.VrsOut("OUTPUT_NO", firstBean.getOutputNo());
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