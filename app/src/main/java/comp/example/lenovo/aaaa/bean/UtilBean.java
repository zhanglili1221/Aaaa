package comp.example.lenovo.aaaa.bean;

import java.util.List;

/**
 * @author: 章黎黎
 * @Date: 2019/5/5  16:03
 * @description: $描述
 */
public class UtilBean {

    /**
     * result : [{"commodityId":141,"commodityName":"AUXTUN港仔原宿男鞋秋季鞋子男潮鞋百搭韩版潮流男士休闲鞋板鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/nbx/7/1.jpg","price":99,"saleNum":0},{"commodityId":149,"commodityName":"新品蛇纹商务正装系带皮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/px/1/1.jpg","price":258,"saleNum":0},{"commodityId":157,"commodityName":"舒适百搭套脚商务休闲鞋男士皮鞋男鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/swxxx/2/1.jpg","price":249,"saleNum":0},{"commodityId":165,"commodityName":"特步XTEP 减震耐磨 男款全掌气垫跑鞋运动鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/ydx/3/1.jpg","price":199,"saleNum":0},{"commodityId":138,"commodityName":"秋男鞋时尚男士休闲鞋系带防磨脚男士皮鞋潮流休闲板鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/nbx/4/1.jpg","price":449,"saleNum":0},{"commodityId":146,"commodityName":"时尚潮流 男鞋 套脚休闲板鞋帆布鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/nfbx/5/1.jpg","price":129,"saleNum":0},{"commodityId":154,"commodityName":"三接头秋冬男鞋 布洛克商务休闲皮鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/px/6/1.jpg","price":469,"saleNum":0},{"commodityId":162,"commodityName":"冬季新款 牛皮纯色保暖绒里纯色套脚休闲鞋英伦风商务休闲鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/swxxx/7/1.jpg","price":258,"saleNum":0},{"commodityId":135,"commodityName":"青春时尚 潮流男鞋 韩版舒适简约百搭板鞋男士休闲鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/nbx/1/1.jpg","price":149,"saleNum":0},{"commodityId":143,"commodityName":"素雅净色男士套脚帆布鞋懒人鞋平底休闲鞋","masterPic":"http://172.17.8.100/images/small/commodity/nx/nfbx/2/1.jpg","price":44,"saleNum":0}]
     * message : 查询成功
     * status : 0000
     */

    private String message;
    private String status;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * commodityId : 141
         * commodityName : AUXTUN港仔原宿男鞋秋季鞋子男潮鞋百搭韩版潮流男士休闲鞋板鞋
         * masterPic : http://172.17.8.100/images/small/commodity/nx/nbx/7/1.jpg
         * price : 99
         * saleNum : 0
         */

        private int commodityId;
        private String commodityName;
        private String masterPic;
        private int price;
        private int saleNum;

        public int getCommodityId() {
            return commodityId;
        }

        public void setCommodityId(int commodityId) {
            this.commodityId = commodityId;
        }

        public String getCommodityName() {
            return commodityName;
        }

        public void setCommodityName(String commodityName) {
            this.commodityName = commodityName;
        }

        public String getMasterPic() {
            return masterPic;
        }

        public void setMasterPic(String masterPic) {
            this.masterPic = masterPic;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSaleNum() {
            return saleNum;
        }

        public void setSaleNum(int saleNum) {
            this.saleNum = saleNum;
        }
    }
}
