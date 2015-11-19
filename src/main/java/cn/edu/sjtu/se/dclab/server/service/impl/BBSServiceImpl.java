package cn.edu.sjtu.se.dclab.server.service.impl;

import cn.edu.sjtu.se.dclab.server.entity.BBSPost;
import cn.edu.sjtu.se.dclab.server.entity.BBSReply;
import cn.edu.sjtu.se.dclab.server.mapper.BBSMapper;
import cn.edu.sjtu.se.dclab.server.service.BBSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BBSServiceImpl implements BBSService {
    @Autowired
    private BBSMapper bbsMapper;
    @Override
    public Collection<BBSPost> findAll() {
        return bbsMapper.findAll();
    }


    @Override
    public void save(BBSPost bbsPost) {
        // TODO Auto-generated method stub
        bbsMapper.save(bbsPost);
    }

    @Override
    public void saveReply(BBSReply bbsReply) {
        // TODO Auto-generated method stub
        bbsMapper.saveReply(bbsReply);
    }

    @Override
    public void saveReplyReply(BBSReply bbsReply){
        bbsMapper.saveReplyReply(bbsReply);
    }

    @Override
    public Collection<BBSPost> findBbsPostById(long id) {
            return bbsMapper.findBbsPostById(id);
    }

    @Override
    public Collection<BBSReply> findBbsRepliesByPostId(long post_id) {
        return bbsMapper.findBbsRepliesByPostId(post_id);
    }

    @Override
    public Collection<BBSReply> findBbsReplyReplies(long post_id, long reply_id) {
        return bbsMapper.findBbsReplyReplies(post_id, reply_id);
    }

    @Override
    public String test(String name) {
        return "Hi " + name;
    }
}