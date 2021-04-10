package service;

import exception.SandboxServerErrorException;
import request.PostJobOpeningRequest;
import response.PostJobOpeningResponse;
import util.HTTPRegex;

public class PostJobOpeningService extends ServiceTemplate<PostJobOpeningRequest, PostJobOpeningResponse>{

    @Override
    public PostJobOpeningResponse doRequest(PostJobOpeningRequest request) {
        try {
            getJobOpeningDAO().addJobOpening(request.getJobOpening());
        } catch (Exception e) {
            throw new SandboxServerErrorException(HTTPRegex.SERVER_ERROR + e.getMessage());
        }
        return new PostJobOpeningResponse("Opening posted", true);
    }
}