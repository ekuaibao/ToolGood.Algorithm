namespace ToolGood.Algorithm.LitJson
{

    interface IJsonWrapper
    {
        bool IsArray { get; }
        bool IsBoolean { get; }
        bool IsDouble { get; }
        bool IsObject { get; }
        bool IsString { get; }
        bool IsNull { get; }

        void SetBoolean(bool val);
        void SetDouble(double val);
        void SetJsonType(JsonType type);
        void SetString(string val);
        void SetNull();

        void Add(IJsonWrapper val);

        void Set(string key, IJsonWrapper val);


    }
}
