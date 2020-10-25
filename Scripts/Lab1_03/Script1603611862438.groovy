import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'Trần Thanh Phương')

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), '8];+R@F\'wwyZwB<Nd*tLy&+Mt(9>RLz@X}y&:f"fQf{}kQu{B,Js%%p~ehhj9}Hct6DfYjagT^EcFc$,\\@bK/,V\\UT-=D<*QKKs^{jSqXR`m>[C:$rt>@K~mFQ/=vHT!HU_2=pZ^cN4_(/U$?u+\',77^LEwj9S3KfwT`TSk$9Fr6EC8[#A6S%<&:)K&L_fvr(r5\'tgEHjDzM3-5nUMy"p"+mb4_Lv2nbW]Bd*G&[CT<+J!q=,/RNSJMq)B;J8.r%asQt({Je2,ayC8,"*Lc!*`t=R9]"a_>^v`_;W@;n\\R{x:3<2Mp*.T;TQ$uv.c:]]^GWL"8#8S+~_PSu]a)j#m~~Bq+cttMJ6,qzbW{*2KT#yt#(&ERRL}7JN9\\[m<@4UzQN,F/cu39=+:*k$<*&""RRyrsdd$_6sCrQUgNA~hf8NDL;ce3)t]MN-}cU7KNZ<>,mx,9u<\\v4ae"_accf!Pe42)UvdL\'#54T,<*yyZ?>pcUgY)-Lmu="hKe4HYw}.BVpJcgn.xL4[xA@5L~W)bgkP-Nr5^/::s;pFaj2T%RG:j]LM}uc4yTW@NcG8XD\\#?^G\\Cw>]a!dmCM*>>C}e[+MWGbWDyF\'M}cR{4>6+8{TutM&G]ma^nBe/%SregkCJ}ET.,bHe2P8~XMN(6FF)Y<=2vJ@MKC*u$?kA;#4cWc=kJ47$]*S,%pE4XFc@sJ!/yXk]W7\\/S(\'GZ4,F/F3+w9Qc[*uL>f\'y8[3&6fUZzqcwH`C-g2R-x${?ER&$aEM:jgAC\'uZKAWrPGj)t${.]}Pn]7,;Q9wVH[6Xx9Fmu!3G"#4=M5QWWYQC_d@Ax5PrzbC,\'*VVFYYFL\'r,D`thY5E=9rpG%\'ukqF:E54/v2#Z-_Y_sgusnNY>pk?bd6WCVU&GYbR<TUQ@=-;/u-g:-[%g2.2RS#PKqgm@\'8HU>gG,M<yMuCk[>EnM%S+`52B2wakmq@{MAU(LyQ5x-{44LTTgY)pk"ELLCxMQ*HA~eK^Jd}R+PM/g4M.xAwe-c;WkYgL\'ez^\\BTpgAeMJ),Vh?9E2-s7Sz29%~%Q/BN3$2_Mt3n*Tn*+u?v]"{T9)YKLufQ_)>FZh%_@?3ytSA9PX@ArzJp\\f,p[n\'\\}$wMEP\'/A!h]$?Z"`Ng7MSpXSQwBE;N>!Q4DnM9.U@QBd)!PX^&4&/"{Vz^fVkwfrp]]%L!_"?/)pw-2Qq&rs2[:D_*8A?hnj!+-?Dvy]L"MfTF)3Ccdan_VVNLt_N7Z6f`/SPCRN9";?u/96V,~FL>,9sJMx>+n#3B9%.\\UC8Au+PEq@C4a3>#`dH\'Xt#MWQDJTwunA6m(ZGR5";8ky]gj,5\\;nKA6j#b^CH,dQJ`9][Us77=M?:Hhg>"&f5Nh"Wu/GT{$sF[MXZ7j74hf^8au}RLQ\'y]a==zP%sC$nLeuus9f+37Th(&[DW;\\]+q<!QA[j?D4R2\\}t3P3xU<,t.sPY.,v$)?8)x/RH{/%g>Mjpb}9C@QF+@Lj7H&c9m25DE2Mp,Bh7=+)C"LQ?qKQzM&}=Udbk2DZj5pf7+m.Z@CUWs)<ep`(5(wz%Z#gRA7%-84^@NG]Tet{AzF2KkH=jD%~4\\LxD)xnp!MYaA=[=&#5U(\\9#Y$n#Uf\'UuVd}jV^b#f6.+9D4p\\.ta*6^_/>CZM$eT$`u-*rnV;!3[pL+.^;{#A%Z4?$&&c7PZ<zEU\\3bcd:2JQ;=\\YrrA#Vr&(zA-_H<FyQ63#q~?;w#R%vQS3k)wr4yeL={y-r[#EXJ)J~]ktMYZQNyc"MwNTW?8\\Ae*5^rmWQjG6C#Ky]^AYc,{?d4LW&h{#tV[e;YDt>^^Q;A>%Ys(!TfG\'@`}_[d)E\'A?rcd;,Zb=^5]:F*2Lwn2#KRBdsG9[t\'EU7YH3p)~{Mxx/@_pwuE[/.Z9?]mC%S/yq/7FpaAn\';U^2Dk/D8fpg#v5Y2~V[,R2a3]E9>;7J{qPt!E2RR+u_BZ$\\MN:eL*gBxVP/2g{h+eryUVsXf`7^mp"Hg7[Lyv\\t_sq=mM{H+t&#3*\\K2b@EHWbmK/#2_Xw2Rx)X56U<&Lk8\n0x53e101\n0x65e101\n0x65U+A0&#160;\n\\u00A0w119\n0x77h104\n0x68a97\n0x61t116\n0x74\'39\n0x27s115\n0x73·​32\n0x20h104\n0x68i105\n0x69d100\n0x64d100\n0x64e101\n0x65n110\n0x6e·​32\n0x20i105\n0x69n110\n0x6e·​32\n0x20y121\n0x79o111\n0x6fu117\n0x75r114\n0x72·​32\n0x20s115\n0x73t116\n0x74r114\n0x72i105\n0x69n110\n0x6eg103\n0x67…&#8230;\n\\u2026⟶​9\n0x09o111\n0x6fr114\n0x72·​32\n0x20b98\n0x62e101\n0x65U+200B&#8203;\n\\u200Bh104\n0x68i105\n0x69n110\n0x6ed100\n0x64U+FEFF&#65279;\n\\uFEFF\n')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.closeBrowser()

