package toolgood.algorithm.math;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import toolgood.algorithm.math.mathParser2.*;
/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mathVisitor<Result> extends ParseTreeVisitor<Result> {
	Result visitProg( ProgContext context);
	Result visitCEILING_fun( CEILING_funContext context);
	Result visitFACT_fun( FACT_funContext context);
	Result visitREGEXREPALCE_fun( REGEXREPALCE_funContext context);
	Result visitAddSub_fun( AddSub_funContext context);
	Result visitAVERAGEIF_fun( AVERAGEIF_funContext context);
	Result visitRIGHT_fun( RIGHT_funContext context);
	Result visitOCT2BIN_fun( OCT2BIN_funContext context);
	Result visitQUARTILE_fun( QUARTILE_funContext context);
	Result visitFINV_fun( FINV_funContext context);
	Result visitNOT_fun( NOT_funContext context);
	Result visitDAYS360_fun( DAYS360_funContext context);
	Result visitWEEKNUM_fun( WEEKNUM_funContext context);
	Result visitPOISSON_fun( POISSON_funContext context);
	Result visitISREGEX_fun( ISREGEX_funContext context);
	Result visitPERCENTILE_fun( PERCENTILE_funContext context);
	Result visitSHA256_fun( SHA256_funContext context);
	Result visitHYPGEOMDIST_fun( HYPGEOMDIST_funContext context);
	Result visitPERMUT_fun( PERMUT_funContext context);
	Result visitTRIMSTART_fun( TRIMSTART_funContext context);
	Result visitRMB_fun( RMB_funContext context);
	Result visitDEC2HEX_fun( DEC2HEX_funContext context);
	Result visitCLEAN_fun( CLEAN_funContext context);
	Result visitLOWER_fun( LOWER_funContext context);
	Result visitOR_fun( OR_funContext context);
	Result visitNORMSINV_fun( NORMSINV_funContext context);
	Result visitLEFT_fun( LEFT_funContext context);
	Result visitISEVEN_fun( ISEVEN_funContext context);
	Result visitLOGINV_fun( LOGINV_funContext context);
	Result visitWORKDAY_fun( WORKDAY_funContext context);
	Result visitISERROR_fun( ISERROR_funContext context);
	Result visitBIN2DEC_fun( BIN2DEC_funContext context);
	Result visitJIS_fun( JIS_funContext context);
	Result visitCRC32_fun( CRC32_funContext context);
	Result visitLCM_fun( LCM_funContext context);
	Result visitHARMEAN_fun( HARMEAN_funContext context);
	Result visitNORMINV_fun( NORMINV_funContext context);
	Result visitGAMMAINV_fun( GAMMAINV_funContext context);
	Result visitSQRT_fun( SQRT_funContext context);
	Result visitDEGREES_fun( DEGREES_funContext context);
	Result visitMROUND_fun( MROUND_funContext context);
	Result visitDATEDIF_fun( DATEDIF_funContext context);
	Result visitTRIMEND_fun( TRIMEND_funContext context);
	Result visitISLOGICAL_fun( ISLOGICAL_funContext context);
	Result visitINT_fun( INT_funContext context);
	Result visitSUMIF_fun( SUMIF_funContext context);
	Result visitHEX2OCT_fun( HEX2OCT_funContext context);
	Result visitPI_fun( PI_funContext context);
	Result visitYEAR_fun( YEAR_funContext context);
	Result visitSQRTPI_fun( SQRTPI_funContext context);
	Result visitCONCATENATE_fun( CONCATENATE_funContext context);
	Result visitCOUNT_fun( COUNT_funContext context);
	Result visitFALSE_fun( FALSE_funContext context);
	Result visitHTMLENCODE_fun( HTMLENCODE_funContext context);
	Result visitBASE64URLTOTEXT_fun( BASE64URLTOTEXT_funContext context);
	Result visitLOG10_fun( LOG10_funContext context);
	Result visitISTEXT_fun( ISTEXT_funContext context);
	Result visitNEGBINOMDIST_fun( NEGBINOMDIST_funContext context);
	Result visitNETWORKDAYS_fun( NETWORKDAYS_funContext context);
	Result visitFACTDOUBLE_fun( FACTDOUBLE_funContext context);
	Result visitTIMEVALUE_fun( TIMEVALUE_funContext context);
	Result visitAVEDEV_fun( AVEDEV_funContext context);
	Result visitGUID_fun( GUID_funContext context);
	Result visitJSON_fun( JSON_funContext context);
	Result visitFIXED_fun( FIXED_funContext context);
	Result visitGetJsonValue_fun( GetJsonValue_funContext context);
	Result visitTINV_fun( TINV_funContext context);
	Result visitEDATE_fun( EDATE_funContext context);
	Result visitGEOMEAN_fun( GEOMEAN_funContext context);
	Result visitVAR_fun( VAR_funContext context);
	Result visitSIGN_fun( SIGN_funContext context);
	Result visitEOMONTH_fun( EOMONTH_funContext context);
	Result visitFLOOR_fun( FLOOR_funContext context);
	Result visitHOUR_fun( HOUR_funContext context);
	Result visitLEN_fun( LEN_funContext context);
	Result visitACOS_fun( ACOS_funContext context);
	Result visitISNULLORWHITESPACE_fun( ISNULLORWHITESPACE_funContext context);
	Result visitNUM_fun( NUM_funContext context);
	Result visitCOSH_fun( COSH_funContext context);
	Result visitQUOTIENT_fun( QUOTIENT_funContext context);
	Result visitOCT2DEC_fun( OCT2DEC_funContext context);
	Result visitSEARCH_fun( SEARCH_funContext context);
	Result visitROUNDUP_fun( ROUNDUP_funContext context);
	Result visitCOMBIN_fun( COMBIN_funContext context);
	Result visitCODE_fun( CODE_funContext context);
	Result visitASINH_fun( ASINH_funContext context);
	Result visitSIN_fun( SIN_funContext context);
	Result visitSUBSTRING_fun( SUBSTRING_funContext context);
	Result visitRANDBETWEEN_fun( RANDBETWEEN_funContext context);
	Result visitAVERAGE_fun( AVERAGE_funContext context);
	Result visitLOG_fun( LOG_funContext context);
	Result visitHMACSHA512_fun( HMACSHA512_funContext context);
	Result visitAndOr_fun( AndOr_funContext context);
	Result visitSTDEVP_fun( STDEVP_funContext context);
	Result visitArray_fun( Array_funContext context);
	Result visitROUND_fun( ROUND_funContext context);
	Result visitEXP_fun( EXP_funContext context);
	Result visitCOUNTIF_fun( COUNTIF_funContext context);
	Result visitVARP_fun( VARP_funContext context);
	Result visitREMOVEEND_fun( REMOVEEND_funContext context);
	Result visitDATE_fun( DATE_funContext context);
	Result visitPARAMETER_fun( PARAMETER_funContext context);
	Result visitSPLIT_fun( SPLIT_funContext context);
	Result visitURLDECODE_fun( URLDECODE_funContext context);
	Result visitLARGE_fun( LARGE_funContext context);
	Result visitVALUE_fun( VALUE_funContext context);
	Result visitDAY_fun( DAY_funContext context);
	Result visitWEIBULL_fun( WEIBULL_funContext context);
	Result visitHMACSHA256_fun( HMACSHA256_funContext context);
	Result visitBINOMDIST_fun( BINOMDIST_funContext context);
	Result visitJudge_fun( Judge_funContext context);
	Result visitDEVSQ_fun( DEVSQ_funContext context);
	Result visitMODE_fun( MODE_funContext context);
	Result visitBETAINV_fun( BETAINV_funContext context);
	Result visitMAX_fun( MAX_funContext context);
	Result visitMINUTE_fun( MINUTE_funContext context);
	Result visitTAN_fun( TAN_funContext context);
	Result visitIFERROR_fun( IFERROR_funContext context);
	Result visitFDIST_fun( FDIST_funContext context);
	Result visitINDEXOF_fun( INDEXOF_funContext context);
	Result visitUPPER_fun( UPPER_funContext context);
	Result visitHTMLDECODE_fun( HTMLDECODE_funContext context);
	Result visitEXPONDIST_fun( EXPONDIST_funContext context);
	Result visitDEC2BIN_fun( DEC2BIN_funContext context);
	Result visitHEX2DEC_fun( HEX2DEC_funContext context);
	Result visitSMALL_fun( SMALL_funContext context);
	Result visitODD_fun( ODD_funContext context);
	Result visitTEXTTOBASE64_fun( TEXTTOBASE64_funContext context);
	Result visitMID_fun( MID_funContext context);
	Result visitPERCENTRANK_fun( PERCENTRANK_funContext context);
	Result visitSTDEV_fun( STDEV_funContext context);
	Result visitNORMSDIST_fun( NORMSDIST_funContext context);
	Result visitISNUMBER_fun( ISNUMBER_funContext context);
	Result visitLASTINDEXOF_fun( LASTINDEXOF_funContext context);
	Result visitMOD_fun( MOD_funContext context);
	Result visitCHAR_fun( CHAR_funContext context);
	Result visitREGEX_fun( REGEX_funContext context);
	Result visitTEXTTOBASE64URL_fun( TEXTTOBASE64URL_funContext context);
	Result visitMD5_fun( MD5_funContext context);
	Result visitREPLACE_fun( REPLACE_funContext context);
	Result visitACOSH_fun( ACOSH_funContext context);
	Result visitISODD_fun( ISODD_funContext context);
	Result visitASC_fun( ASC_funContext context);
	Result visitCOS_fun( COS_funContext context);
	Result visitLN_fun( LN_funContext context);
	Result visitSTRING_fun( STRING_funContext context);
	Result visitHMACMD5_fun( HMACMD5_funContext context);
	Result visitPRODUCT_fun( PRODUCT_funContext context);
	Result visitEXACT_fun( EXACT_funContext context);
	Result visitSUMSQ_fun( SUMSQ_funContext context);
	Result visitSUM_fun( SUM_funContext context);
	Result visitSECOND_fun( SECOND_funContext context);
	Result visitGAMMADIST_fun( GAMMADIST_funContext context);
	Result visitOCT2HEX_fun( OCT2HEX_funContext context);
	Result visitTODAY_fun( TODAY_funContext context);
	Result visitATAN_fun( ATAN_funContext context);
	Result visitE_fun( E_funContext context);
	Result visitTRIM_fun( TRIM_funContext context);
	Result visitRADIANS_fun( RADIANS_funContext context);
	Result visitGAMMALN_fun( GAMMALN_funContext context);
	Result visitTEXT_fun( TEXT_funContext context);
	Result visitFISHER_fun( FISHER_funContext context);
	Result visitAND_fun( AND_funContext context);
	Result visitBIN2HEX_fun( BIN2HEX_funContext context);
	Result visitMULTINOMIAL_fun( MULTINOMIAL_funContext context);
	Result visitMONTH_fun( MONTH_funContext context);
	Result visitURLENCODE_fun( URLENCODE_funContext context);
	Result visitNORMDIST_fun( NORMDIST_funContext context);
	Result visitHMACSHA1_fun( HMACSHA1_funContext context);
	Result visitENDSWITH_fun( ENDSWITH_funContext context);
	Result visitBracket_fun( Bracket_funContext context);
	Result visitBETADIST_fun( BETADIST_funContext context);
	Result visitATANH_fun( ATANH_funContext context);
	Result visitNOW_fun( NOW_funContext context);
	Result visitMEDIAN_fun( MEDIAN_funContext context);
	Result visitPOWER_fun( POWER_funContext context);
	Result visitDEC2OCT_fun( DEC2OCT_funContext context);
	Result visitPROPER_fun( PROPER_funContext context);
	Result visitTRUNC_fun( TRUNC_funContext context);
	Result visitGCD_fun( GCD_funContext context);
	Result visitTANH_fun( TANH_funContext context);
	Result visitHEX2BIN_fun( HEX2BIN_funContext context);
	Result visitSINH_fun( SINH_funContext context);
	Result visitSHA512_fun( SHA512_funContext context);
	Result visitMIN_fun( MIN_funContext context);
	Result visitISNONTEXT_fun( ISNONTEXT_funContext context);
	Result visitABS_fun( ABS_funContext context);
	Result visitROUNDDOWN_fun( ROUNDDOWN_funContext context);
	Result visitIF_fun( IF_funContext context);
	Result visitJOIN_fun( JOIN_funContext context);
	Result visitFIND_fun( FIND_funContext context);
	Result visitSUBSTITUTE_fun( SUBSTITUTE_funContext context);
	Result visitREPT_fun( REPT_funContext context);
	Result visitASIN_fun( ASIN_funContext context);
	Result visitMulDiv_fun( MulDiv_funContext context);
	Result visitREMOVESTART_fun( REMOVESTART_funContext context);
	Result visitT_fun( T_funContext context);
	Result visitWEEKDAY_fun( WEEKDAY_funContext context);
	Result visitBIN2OCT_fun( BIN2OCT_funContext context);
	Result visitBASE64TOTEXT_fun( BASE64TOTEXT_funContext context);
	Result visitTDIST_fun( TDIST_funContext context);
	Result visitDATEVALUE_fun( DATEVALUE_funContext context);
	Result visitSTARTSWITH_fun( STARTSWITH_funContext context);
	Result visitEVEN_fun( EVEN_funContext context);
	Result visitLOGNORMDIST_fun( LOGNORMDIST_funContext context);
	Result visitISNULLOREMPTY_fun( ISNULLOREMPTY_funContext context);
	Result visitTRUE_fun( TRUE_funContext context);
	Result visitFISHERINV_fun( FISHERINV_funContext context);
	Result visitSHA1_fun( SHA1_funContext context);
	Result visitTIME_fun( TIME_funContext context);
	Result visitATAN2_fun( ATAN2_funContext context);
	Result visitRAND_fun( RAND_funContext context);
	Result visitParameter( ParameterContext context);
	Result visitParameter2( Parameter2Context context);
	Result visitExpr2_fun( Expr2_funContext context);
	Result visitVLOOKUP_fun( VLOOKUP_funContext context);
	Result visitLOOKUP_fun( LOOKUP_funContext context);
	Result visitNULL_fun( NULL_funContext context);
	Result visitISNULL_fun( ISNULL_funContext context);
	Result visitISNULLORERROR_fun( ISNULLORERROR_funContext context);
	Result visitDiyFunction_fun(DiyFunction_funContext context);
	Result visitPercentage_fun(Percentage_funContext context);
}