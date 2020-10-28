package handler;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

public class MyMetaObjectHandler extends MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        //获取需要填充的字段
        Object fieldValue = getFieldValByName("name",metaObject);
        //如果该字段没有设置值
        if(fieldValue == null){
            //那就将其设置为"林志玲"
            setFieldValByName("name","林志玲",metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //获取需要填充的字段
        Object fieldValue = getFieldValByName("name",metaObject);
        //如果该字段没有设置值
        if(fieldValue == null){
            //那就将其设置为"朱茵"
            setFieldValByName("name","朱茵",metaObject);
        }
    }
}
