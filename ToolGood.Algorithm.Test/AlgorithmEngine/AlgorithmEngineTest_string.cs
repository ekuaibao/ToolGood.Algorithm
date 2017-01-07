﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using PetaTest;

namespace ToolGood.Algorithm
{
    [TestFixture]
    class AlgorithmEngineTest_string
    {
        [Test]
        public void ASC_test()
        {
            AlgorithmEngine engine = new AlgorithmEngine();
            var t = engine.TryEvaluate("asc('ａｂｃＡＢＣ１２３')", "");
            Assert.AreEqual(t, "abcABC123");
        }
        [Test]
        public void Jis_test()
        {
            AlgorithmEngine engine = new AlgorithmEngine();
            var t = engine.TryEvaluate("jis('abcABC123')", "");
            Assert.AreEqual(t, "ａｂｃＡＢＣ１２３");
            t = engine.TryEvaluate("WIDECHAR('abcABC123')", "");
            Assert.AreEqual(t, "ａｂｃＡＢＣ１２３");
        }

        [Test]
        public void CHAR_test()
        {
            AlgorithmEngine engine = new AlgorithmEngine();
            var t = engine.TryEvaluate("char(49)", "");
            Assert.AreEqual(t, "1");
        }

        [Test]
        public void CLEAN_test()
        {
            AlgorithmEngine engine = new AlgorithmEngine();
            var t = engine.TryEvaluate("clean('\\r112\\t')", "");
            Assert.AreEqual(t, "112");
        }
        [Test]
        public void code_test()
        {
            AlgorithmEngine engine = new AlgorithmEngine();
            var t = engine.TryEvaluate("code('1')", 0);
            Assert.AreEqual(t, 49);
        }

        [Test]
        public void CONCATENATE_test()
        {
            AlgorithmEngine engine = new AlgorithmEngine();
            var t = engine.TryEvaluate("CONCATENATE('tt','33')", "");
            Assert.AreEqual(t, "tt33");
        }
        [Test]
        public void EXACT_test()
        {
            AlgorithmEngine engine = new AlgorithmEngine();
            var t = engine.TryEvaluate("EXACT('tt','33')", false);
            Assert.AreEqual(t, false);
            t = engine.TryEvaluate("EXACT('tt','tt')", true);
            Assert.AreEqual(t, true);
        }
        [Test]
        public void FIND_test()
        {
            AlgorithmEngine engine = new AlgorithmEngine();
            var t = engine.TryEvaluate("FIND(\"11\",\"12221122\")", 0);
            Assert.AreEqual(t, 5);
        }

        [Test]
        public void FIXED_test()
        {
            AlgorithmEngine engine = new AlgorithmEngine();
            var t = engine.TryEvaluate("FIXED(4567.89,1)","");
            Assert.AreEqual(t, "4,567.9");
            //t = engine.TryEvaluate(" FIXED(4567.89,-1)", "");//iserror
            //Assert.AreEqual(t, "4,570.0");
            t = engine.TryEvaluate("FIXED(-4567.89, 1, TRUE())", "");
            Assert.AreEqual(t, "-4567.9");
            t = engine.TryEvaluate("FIXED(77.888)", "");
            Assert.AreEqual(t, "77.89");
        }




    }
}
