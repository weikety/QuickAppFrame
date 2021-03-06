package cn.richinfo.frame.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import cn.richinfo.frame.data.response.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property MemberSex = new Property(1, int.class, "memberSex", false, "MEMBER_SEX");
        public final static Property MemberLastX = new Property(2, String.class, "memberLastX", false, "MEMBER_LAST_X");
        public final static Property MemberNickname = new Property(3, String.class, "memberNickname", false, "sex");
        public final static Property MemberIcon = new Property(4, String.class, "memberIcon", false, "MEMBER_ICON");
        public final static Property MemberMobile = new Property(5, String.class, "memberMobile", false, "MEMBER_MOBILE");
        public final static Property MemberId = new Property(6, int.class, "memberId", false, "MEMBER_ID");
        public final static Property MemberLastExperience = new Property(7, String.class, "memberLastExperience", false, "MEMBER_LAST_EXPERIENCE");
        public final static Property MemberLevelName = new Property(8, String.class, "memberLevelName", false, "MEMBER_LEVEL_NAME");
        public final static Property MemberBirthday = new Property(9, long.class, "memberBirthday", false, "MEMBER_BIRTHDAY");
        public final static Property MemberProvince = new Property(10, String.class, "memberProvince", false, "MEMBER_PROVINCE");
    }


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"MEMBER_SEX\" INTEGER NOT NULL ," + // 1: memberSex
                "\"MEMBER_LAST_X\" TEXT," + // 2: memberLastX
                "\"sex\" TEXT," + // 3: memberNickname
                "\"MEMBER_ICON\" TEXT," + // 4: memberIcon
                "\"MEMBER_MOBILE\" TEXT," + // 5: memberMobile
                "\"MEMBER_ID\" INTEGER NOT NULL ," + // 6: memberId
                "\"MEMBER_LAST_EXPERIENCE\" TEXT," + // 7: memberLastExperience
                "\"MEMBER_LEVEL_NAME\" TEXT," + // 8: memberLevelName
                "\"MEMBER_BIRTHDAY\" INTEGER NOT NULL ," + // 9: memberBirthday
                "\"MEMBER_PROVINCE\" TEXT);"); // 10: memberProvince
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getMemberSex());
 
        String memberLastX = entity.getMemberLastX();
        if (memberLastX != null) {
            stmt.bindString(3, memberLastX);
        }
 
        String memberNickname = entity.getMemberNickname();
        if (memberNickname != null) {
            stmt.bindString(4, memberNickname);
        }
 
        String memberIcon = entity.getMemberIcon();
        if (memberIcon != null) {
            stmt.bindString(5, memberIcon);
        }
 
        String memberMobile = entity.getMemberMobile();
        if (memberMobile != null) {
            stmt.bindString(6, memberMobile);
        }
        stmt.bindLong(7, entity.getMemberId());
 
        String memberLastExperience = entity.getMemberLastExperience();
        if (memberLastExperience != null) {
            stmt.bindString(8, memberLastExperience);
        }
 
        String memberLevelName = entity.getMemberLevelName();
        if (memberLevelName != null) {
            stmt.bindString(9, memberLevelName);
        }
        stmt.bindLong(10, entity.getMemberBirthday());
 
        String memberProvince = entity.getMemberProvince();
        if (memberProvince != null) {
            stmt.bindString(11, memberProvince);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getMemberSex());
 
        String memberLastX = entity.getMemberLastX();
        if (memberLastX != null) {
            stmt.bindString(3, memberLastX);
        }
 
        String memberNickname = entity.getMemberNickname();
        if (memberNickname != null) {
            stmt.bindString(4, memberNickname);
        }
 
        String memberIcon = entity.getMemberIcon();
        if (memberIcon != null) {
            stmt.bindString(5, memberIcon);
        }
 
        String memberMobile = entity.getMemberMobile();
        if (memberMobile != null) {
            stmt.bindString(6, memberMobile);
        }
        stmt.bindLong(7, entity.getMemberId());
 
        String memberLastExperience = entity.getMemberLastExperience();
        if (memberLastExperience != null) {
            stmt.bindString(8, memberLastExperience);
        }
 
        String memberLevelName = entity.getMemberLevelName();
        if (memberLevelName != null) {
            stmt.bindString(9, memberLevelName);
        }
        stmt.bindLong(10, entity.getMemberBirthday());
 
        String memberProvince = entity.getMemberProvince();
        if (memberProvince != null) {
            stmt.bindString(11, memberProvince);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // memberSex
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // memberLastX
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // memberNickname
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // memberIcon
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // memberMobile
            cursor.getInt(offset + 6), // memberId
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // memberLastExperience
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // memberLevelName
            cursor.getLong(offset + 9), // memberBirthday
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // memberProvince
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setMemberSex(cursor.getInt(offset + 1));
        entity.setMemberLastX(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMemberNickname(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMemberIcon(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMemberMobile(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMemberId(cursor.getInt(offset + 6));
        entity.setMemberLastExperience(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMemberLevelName(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setMemberBirthday(cursor.getLong(offset + 9));
        entity.setMemberProvince(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
